package com.jcv.mocktests.ui.exam

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ExamScreen(
    onFinishExam: () -> Unit
) {
    // This is a placeholder for your OkHttp Google Sheets integration and Exam UI.
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Exam in Progress...")
        
        Button(onClick = { 
            // Simulate finishing the exam
            onFinishExam() 
        }) {
            Text(text = "Submit Exam")
        }
    }
}
