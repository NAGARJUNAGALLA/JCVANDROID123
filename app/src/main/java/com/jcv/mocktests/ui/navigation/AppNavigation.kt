package com.jcv.mocktests.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jcv.mocktests.ui.exam.ExamScreen
import com.jcv.mocktests.ui.login.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "loginRoute") {
        
        composable("loginRoute") {
            LoginScreen(
                onLoginSuccess = { 
                    navController.navigate("examRoute") {
                        // This prevents the user from going back to login using the back button
                        popUpTo("loginRoute") { inclusive = true } 
                    } 
                },
                onNavigateToSignUp = { 
                    // Add your sign up navigation logic here later if needed
                }
            )
        }
        
        composable("examRoute") {
            ExamScreen(
                onFinishExam = { 
                    // Logic to handle when the exam is submitted/finished
                }
            )
        }
        
    }
}
