package com.github.kadehar.newsfetcher.feature.bookmarksscreen.data

import androidx.lifecycle.LiveData
import com.github.kadehar.newsfetcher.feature.mainscreen.domain.model.NewsDomainModel

interface BookmarksRepository {
    suspend fun create(article: NewsDomainModel)
    suspend fun read(): List<NewsDomainModel>
    suspend fun subscribeByDesc(): LiveData<List<NewsDomainModel>>
    suspend fun update(article: NewsDomainModel)
    suspend fun delete(article: NewsDomainModel)
}