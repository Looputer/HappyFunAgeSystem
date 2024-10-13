package com.android.happyfunageclasssystem.logic.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.android.happyfunageclasssystem.logic.dao.LessonDao
import com.android.happyfunageclasssystem.logic.entity.Lesson

@Database(version = 1, entities = [Lesson::class])
abstract class LessonDatabase : RoomDatabase()
{
    abstract fun lessonDao() : LessonDao
    companion object
    {
        private var instance : LessonDatabase? = null
        @Synchronized
        fun getDatabase(context : Context) : LessonDatabase
        {
            instance?.let { return it }
            return Room.databaseBuilder(context.applicationContext, LessonDatabase::class.java, "lesson_database").build().apply { instance = this }
        }
    }
}