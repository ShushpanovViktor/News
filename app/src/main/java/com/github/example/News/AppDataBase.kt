package com.github.example.News

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.example.News.feature.bookmarksscreen.data.local.BookmarkDAO
import com.github.example.News.feature.bookmarksscreen.data.local.BookmarkEntity

@Database(entities = [BookmarkEntity::class], version = 11)
abstract class AppDataBase : RoomDatabase() {
    abstract fun bookmarksDAO(): BookmarkDAO
}