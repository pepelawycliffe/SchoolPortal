package com.example.schoolportal.data.studentDatabase

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "StudentDb")
data class Student (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val studentId :String,
    val studentName:String,
    val course:String
)


