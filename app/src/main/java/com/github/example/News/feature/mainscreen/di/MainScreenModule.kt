package com.github.example.News.feature.mainscreen.di

import com.github.example.News.data.api.NewsApi
import com.github.example.News.data.api.NewsRemoteSource
import com.github.example.News.data.api.NewsRepository
import com.github.example.News.data.api.NewsRepositoryImpl
import com.github.example.News.feature.bookmarksscreen.data.BookmarksRepository
import com.github.example.News.feature.bookmarksscreen.domain.BookmarksInteractor
import com.github.example.News.feature.mainscreen.ui.MainScreenViewModel
import com.github.example.News.feature.mainscreen.domain.MainScreenNewsInteractor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainScreenModule = module {
    viewModel<MainScreenViewModel>{
        MainScreenViewModel(get<MainScreenNewsInteractor>(), get<BookmarksInteractor>())
    }

    single<NewsRemoteSource> {
        NewsRemoteSource(get<NewsApi>())
    }

    single<NewsRepository> {
        NewsRepositoryImpl(get<NewsRemoteSource>())
    }

    single<MainScreenNewsInteractor> {
        MainScreenNewsInteractor(get<NewsRepository>(), get<BookmarksRepository>())
    }
}