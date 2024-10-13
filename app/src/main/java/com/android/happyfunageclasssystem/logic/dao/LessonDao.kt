package com.android.happyfunageclasssystem.logic.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.android.happyfunageclasssystem.logic.entity.Lesson

@Dao
interface LessonDao
{
    @Insert
    fun insertLesson(lesson : Lesson)
    @Query("select student from Lesson")
    fun selectStudentFromLesson() : List<String>
    @Query("select teacher from Lesson")
    fun selectTeacherFromLesson() : String
    @Query("select name from Lesson")
    fun selectNameFromLesson() : String
    @Delete
    fun deleteLesson(lesson: Lesson)
    @Query("delete from Lesson where name = :name")
    fun deleteLessonByName(name : String)
}