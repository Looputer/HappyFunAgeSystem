package com.android.happyfunageclasssystem.logic.entity

import androidx.room.Entity

@Entity
data class Lesson(val student : List<String>, val teacher : String, val level : Int, val name : String)
