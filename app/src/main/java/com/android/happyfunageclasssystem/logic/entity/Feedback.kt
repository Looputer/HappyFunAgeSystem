package com.android.happyfunageclasssystem.logic.entity

import androidx.room.Entity
import java.util.Date

@Entity
data class Feedback(val lesson : String, val teacher : String, val feedback : String, val date: Date)