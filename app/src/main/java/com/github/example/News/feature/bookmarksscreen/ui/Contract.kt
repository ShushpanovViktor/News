package com.github.example.News.feature.bookmarksscreen.ui

import com.github.example.News.base.Event
import com.github.example.News.feature.mainscreen.domain.model.NewsDomainModel

data class BookmarksViewState(
    val articles: List<NewsDomainModel>,
    val article: NewsDomainModel?
)

sealed class UIEvent : Event {
    data class OnBookmarksFetched(val articles: List<NewsDomainModel>) : UIEvent()
    data class OnBookmarkClick(val article: NewsDomainModel) : UIEvent()
}

sealed class DataEvent : Event {
    data class RefreshDataBase(val articles: List<NewsDomainModel>) : DataEvent()
}

sealed class OpenArticleEvent : Event {
    data class OnArticleClick(val article: NewsDomainModel) : OpenArticleEvent()
}