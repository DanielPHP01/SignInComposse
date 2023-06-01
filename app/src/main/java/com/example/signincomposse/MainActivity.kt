package com.example.signincomposse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.signincomposse.ui.navigation.Navigation
import com.example.signincomposse.ui.theme.SignInComposseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignInComposseTheme {
                Navigation()
            }
        }
    }
}