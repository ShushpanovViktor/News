package com.github.example.News.feature.bookmarksscreen.di

import com.github.example.News.feature.bookmarksscreen.data.BookmarksRepository
import com.github.example.News.feature.bookmarksscreen.data.BookmarksRepoImpl
import com.github.example.News.feature.bookmarksscreen.data.local.BookmarkDAO
import com.github.example.News.feature.bookmarksscreen.domain.BookmarksInteractor
import com.github.example.News.feature.bookmarksscreen.ui.BookmarksScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val bookmarksModule = module {
    single<BookmarksRepository> {
        BookmarksRepoImpl(get<BookmarkDAO>())
    }

    single<BookmarksInteractor> {
        BookmarksInteractor(get<BookmarksRepository>())
    }

    viewModel<BookmarksScreenViewModel> {
        BookmarksScreenViewModel(get<BookmarksInteractor>())
    }
}