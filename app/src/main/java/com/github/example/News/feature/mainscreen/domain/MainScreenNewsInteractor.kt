package com.github.example.News.feature.mainscreen.domain

import com.github.example.News.base.attempt
import com.github.example.News.base.mapToList
import com.github.example.News.data.api.NewsRepository
import com.github.example.News.feature.bookmarksscreen.data.BookmarksRepository

class MainScreenNewsInteractor(
    private val newsRepository: NewsRepository,
    private val bookmarksRepository: BookmarksRepository
) {
    suspend fun fetchNews() = attempt {
        val news = newsRepository.fetchNews()
        val bookmarks = bookmarksRepository.read()
        mapToList(oldList = news, newList = bookmarks)
    }
}