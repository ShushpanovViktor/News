package com.github.example.News.data.api

import com.github.example.News.data.api.model.NewsModel

class NewsRemoteSource(private val api: NewsApi) {
    suspend fun fetchNews(): NewsModel = api.fetchNews()
}