package com.github.example.News.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsModel(
    @SerializedName("totalResults")
    val totalResults: Long,
    @SerializedName("articles")
    val articles: List<NewsArticleModel>
)

