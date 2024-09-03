package com.example.schoolportal.ui.presentation.student

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.schoolportal.ui.theme.SchoolPortalTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddStudentScreen(){
    var text =""
    var newtext = ""
Scaffold (topBar = {
    CenterAlignedTopAppBar(title = {
        Text(text = "Add student")
    })}){
    paddingValues ->
    Column(modifier = Modifier.padding(paddingValues)) {
    }
    Column (modifier = Modifier.padding(0.dp,60.dp)){
        Column {
            Column {
//                student-id
                Row {
                    Column {
                        Text(text = "Student ID")
                    }
                    Column {
                        TextField(
                            value = text,
                            onValueChange = { newAuthor ->
                                text = newAuthor
                            },
                            placeholder = {
                                Text(
                                    text = ""
                                )
                            }
                        )

                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
//                student name
                Row {
                    Column {
                        Text(text = "Student Name")
                    }
                    Column {
                        TextField(
                            value = text,
                            onValueChange = { newAuthor ->
                                text = newAuthor
                            },
                            placeholder = {
                                Text(
                                    text = ""
                                )
                            }
                        )

                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
//                course
                Row {
                    Column {
                        Text(text = "Course")
                    }
                    Column {
                        TextField(
                            value = text,
                            onValueChange = { newAuthor ->
                                text = newAuthor
                            },
                            placeholder = {
                                Text(
                                    text = ""
                                )
                            }
                        )

                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
              Column(modifier = Modifier.fillMaxWidth(),
                  horizontalAlignment = Alignment.CenterHorizontally) {
                  Button(onClick = { /*TODO*/ },
                      modifier =Modifier.size(280.dp,60.dp)
                  ) {
                      Text(text = "Add Student"
                      )
                  }
              }
            }
        }
    }
}
}

@Preview(showBackground = true)
@Composable
fun AddStudentScreenPreview() {
    SchoolPortalTheme {
        AddStudentScreen()
    }
}