package com.example.signincomposse.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.signincomposse.objects.ScreenConstants
import com.example.signincomposse.ui.screen.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenConstants.WelcomeScreen.route) {
        composable(ScreenConstants.WelcomeScreen.route) {
            WelcomeScreen()
        }

    }
}