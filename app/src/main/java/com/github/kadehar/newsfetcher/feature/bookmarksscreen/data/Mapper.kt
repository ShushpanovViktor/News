package com.github.kadehar.newsfetcher.feature.bookmarksscreen.data

import com.github.kadehar.newsfetcher.feature.bookmarksscreen.data.local.BookmarkEntity
import com.github.kadehar.newsfetcher.feature.mainscreen.domain.model.NewsDomainModel

fun NewsDomainModel.toEntity(): BookmarkEntity = BookmarkEntity(
    url = url,
    imageUrl = urlToImage ?: "",
    author = author ?: "",
    title = title,
    description = description ?: "",
    publishedAt = publishedAt
)

fun BookmarkEntity.toDomain(): NewsDomainModel = NewsDomainModel(
    url = url,
    author = author,
    title = title,
    description = description,
    publishedAt = publishedAt,
    urlToImage = imageUrl
)