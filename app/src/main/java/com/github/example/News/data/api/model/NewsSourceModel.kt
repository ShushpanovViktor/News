package com.github.example.News.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsSourceModel(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String
)

