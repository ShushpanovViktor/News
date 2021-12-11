package com.github.example.News.feature.mainscreen.domain.model

data class NewsDomainModel(
    val author: String?,
    val title: String,
    val description: String?,
    val url: String,
    val urlToImage: String?,
    val publishedAt: String,
    val isBookmarked: Boolean = false
)
