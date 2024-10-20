package com.android.happyfunageclasssystem.logic.database

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.android.happyfunageclasssystem.HappyFunAgeClassSystemApplication

class FeedbackDatabaseHelper(name : String, version : Int) : SQLiteOpenHelper(HappyFunAgeClassSystemApplication.context, name, null, version)
{
    private val createTable = "create table Feedback(teacher text, lesson text, feedback text, level real)"
    override fun onCreate(db: SQLiteDatabase?)
    {
        db?.execSQL(createTable)
    }
    override fun onUpgrade(p0: SQLiteDatabase?, oldVersion: Int, newVersion: Int)
    {

    }
}