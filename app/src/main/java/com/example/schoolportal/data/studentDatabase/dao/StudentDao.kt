package com.example.schoolportal.data.studentDatabase.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.schoolportal.data.studentDatabase.Student
import com.example.schoolportal.data.studentDatabase.repository.Students
import kotlinx.coroutines.flow.Flow


@Dao
interface StudentDao {

    @Query("SELECT * FROM StudentDb ORDER BY id Asc")
    suspend fun getStudents(): Flow<Students>

    @Query("SELECT * FROM StudentDb WHERE id = studentId")
    suspend fun getStudentId(id:String):Student

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addStudent(student: Student)

    @Update
    suspend fun updateStudent(student: Student)

    @Delete
    suspend fun deleteStudent(student: Student)

}