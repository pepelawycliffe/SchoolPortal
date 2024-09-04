package com.example.schoolportal.data.studentDatabase.repository

import com.example.schoolportal.data.studentDatabase.Student
import kotlinx.coroutines.flow.Flow

typealias Students = List<Student>
interface StudentRepository {

    fun getStudents(): Flow<Students>

    suspend fun getStudentId(id:String):Student
    suspend fun insertStudent(student: Student)
    suspend fun UpdateStudent(student: Student)
    suspend fun deleteStudent(student: Student)
}