package com.github.kadehar.newsfetcher.feature.mainscreen.domain.model

data class NewsDomainModel(
    val author: String?,
    val title: String,
    val description: String?,
    val url: String,
    val urlToImage: String?,
    val publishedAt: String
)
