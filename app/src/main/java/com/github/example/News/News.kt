package com.github.example.News

import android.app.Application
import com.github.example.News.di.appModule
import com.github.example.News.di.databaseModule
import com.github.example.News.feature.bookmarksscreen.di.bookmarksModule
import com.github.example.News.feature.mainscreen.di.mainScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class News : Application() {
    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@News)
            modules(appModule, mainScreenModule, databaseModule, bookmarksModule)
        }
    }
}