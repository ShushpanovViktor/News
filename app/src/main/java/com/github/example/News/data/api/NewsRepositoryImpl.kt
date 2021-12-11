package com.github.example.News.data.api

import com.github.example.News.data.toDomain
import com.github.example.News.feature.mainscreen.domain.model.NewsDomainModel

class NewsRepositoryImpl(private val source: NewsRemoteSource) : NewsRepository {
    override suspend fun fetchNews(): List<NewsDomainModel> {
        return source.fetchNews().articles.map { article -> article.toDomain() }
    }
}