package com.github.example.News.feature.bookmarksscreen.domain

import androidx.lifecycle.LiveData
import com.github.example.News.base.attempt
import com.github.example.News.feature.bookmarksscreen.data.BookmarksRepository
import com.github.example.News.feature.mainscreen.domain.model.NewsDomainModel

class BookmarksInteractor(private val repo: BookmarksRepository) {
    suspend fun create(article: NewsDomainModel) = repo.create(article)
    suspend fun read() = attempt { repo.read() }
    suspend fun update(article: NewsDomainModel) = repo.update(article)
    suspend fun delete(article: NewsDomainModel) = attempt {
        repo.delete(article)
    }
    suspend fun subscribeByDesc(): LiveData<List<NewsDomainModel>> = repo.subscribeByDesc()
}