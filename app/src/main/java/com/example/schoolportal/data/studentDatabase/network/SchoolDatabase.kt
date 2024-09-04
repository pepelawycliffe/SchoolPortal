package com.example.schoolportal.data.studentDatabase.network

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.schoolportal.data.studentDatabase.Student
import com.example.schoolportal.data.studentDatabase.dao.StudentDao


@Database(
    entities = [Student::class],
    version = 1,
    exportSchema = false
)
abstract class SchoolDatabase :RoomDatabase() {
    abstract  val studentDao:StudentDao
}



