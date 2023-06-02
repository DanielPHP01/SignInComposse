package com.example.signincomposse.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.signincomposse.objects.ScreenConstants
import com.example.signincomposse.ui.screen.SignInScreen
import com.example.signincomposse.ui.screen.SignUpScreen
import com.example.signincomposse.ui.screen.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenConstants.WelcomeScreen.route) {
        composable(ScreenConstants.WelcomeScreen.route) {
            WelcomeScreen(
                navigationSignIn = { navController.navigate(ScreenConstants.SignInScreen.route) },
                navigationSignUp = { navController.navigate(ScreenConstants.SignUpScreen.route) })
        }
        composable(ScreenConstants.SignInScreen.route) {
            SignInScreen(
                navigationSignUp = { navController.navigate(ScreenConstants.SignUpScreen.route) }
            )
        }
        composable(ScreenConstants.SignUpScreen.route) {
            SignUpScreen(
                navigationSignIn = { navController.navigate(ScreenConstants.SignInScreen.route) }
            )
        }
//        composable(ScreenConstants.DetailScreen.route){
//            Detail()
//        }
    }
}