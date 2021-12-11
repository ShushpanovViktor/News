package com.github.example.News.data

import com.github.example.News.data.api.model.NewsArticleModel
import com.github.example.News.feature.mainscreen.domain.model.NewsDomainModel

fun NewsArticleModel.toDomain(): NewsDomainModel =
    NewsDomainModel(
        author = author,
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt
    )