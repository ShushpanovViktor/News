package com.github.example.News.data.api

import com.github.example.News.consts.HttpRoutes
import com.github.example.News.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import java.util.*

interface NewsApi {
    @GET(HttpRoutes.NEWS_PATH)
    @Headers("X-Api-Key: 59b3296766e7493e88a8a962a688e765")
    suspend fun fetchNews(
        @Query("country") language: String = Locale.getDefault().country
    ) : NewsModel
}