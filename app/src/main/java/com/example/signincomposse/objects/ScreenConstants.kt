package com.example.signincomposse.objects

sealed class ScreenConstants(val route: String){
    object WelcomeScreen : ScreenConstants("welcome_screen")
    object SignInScreen : ScreenConstants("sign_in_screen")
    object SignUpScreen : ScreenConstants("sign_up_screen")
    object DetailScreen : ScreenConstants("detail_screen")
}