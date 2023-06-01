package com.example.signincomposse.objects

sealed class ScreenConstants(val route: String){
    object WelcomeScreen : ScreenConstants("welcome_screen")
}