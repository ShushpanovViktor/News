package com.github.example.News.data.api

import com.github.example.News.feature.mainscreen.domain.model.NewsDomainModel

interface NewsRepository {
    suspend fun fetchNews(): List<NewsDomainModel>
}