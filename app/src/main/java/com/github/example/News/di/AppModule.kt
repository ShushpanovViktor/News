package com.github.example.News.di

import androidx.room.Room
import com.github.example.News.AppDataBase
import com.github.example.News.consts.HttpRoutes
import com.github.example.News.data.api.NewsApi
import com.github.example.News.feature.bookmarksscreen.data.local.BookmarkDAO
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single<OkHttpClient> {
        val httpLogging = HttpLoggingInterceptor()
        httpLogging.level = HttpLoggingInterceptor.Level.BODY

        OkHttpClient.Builder()
            .addInterceptor(httpLogging)
            .build()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(HttpRoutes.BASE_URL)
            .client(get<OkHttpClient>())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single<NewsApi> {
        get<Retrofit>().create(NewsApi::class.java)
    }
}

const val DB = "DATA_BASE"
val databaseModule = module {
    single<AppDataBase> {
        Room.databaseBuilder(androidContext(), AppDataBase::class.java, DB)
            .fallbackToDestructiveMigration()
            .build()
    }

    single<BookmarkDAO> {
        get<AppDataBase>().bookmarksDAO()
    }
}