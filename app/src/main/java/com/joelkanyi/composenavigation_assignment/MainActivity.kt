package com.joelkanyi.composenavigation_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.joelkanyi.composenavigation_assignment.ui.theme.ComposeNavigationAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationAssignmentTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") { HomeScreen(navController = navController) }
                    composable("details") { DetailsScreen(navController = navController) }
                    composable("details") { RatingScreen(navController = navController) }
                }
            }
        }
    }
}