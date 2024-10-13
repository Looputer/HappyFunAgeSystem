package com.android.happyfunageclasssystem.logic.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.android.happyfunageclasssystem.logic.entity.Feedback
import com.android.happyfunageclasssystem.logic.entity.Lesson
import java.util.Date

@Dao
interface FeedbackDao
{
    @Insert
    fun insertFeedback(lesson: Lesson)
    @Query("select lesson from Feedback")
    fun selectNameFromFeedback(feedback : Feedback) : String
    @Delete
    fun deleteFeedback(feedback: Feedback)
    @Query("select date from Feedback")
    fun selectDateFromFeedback(feedback: Feedback) : Date
    @Query("select feedback from Feedback")
    fun selectFeedbackFromFeedback(feedback: Feedback) : String
    @Query("select teacher from Feedback")
    fun selectTeacherFromFeedback(feedback: Feedback) : String
}