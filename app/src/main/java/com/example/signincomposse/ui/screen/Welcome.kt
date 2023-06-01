package com.example.signincomposse.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signincomposse.R
import com.example.signincomposse.ui.theme.MainColor

@Preview(name = "preview")
@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.illustration),
                contentDescription = "",
                modifier = Modifier.padding(top = 110.dp)
            )
            Text(
                text = "Welcome to Relaxify!",
                fontSize = 24.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 30.dp)
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur \n   adipiscing elit. Risus euismod lacus,\n                         pharetra dui. ",
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(top = 20.dp)
            )
            Button(
                onClick = { },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(MainColor),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 120.dp)
            ) {
                Text(
                    text = "Sign up",
                    fontSize = 24.sp,
                )
            }
            Text(text = "Sign in",
                color = MainColor,
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 30.dp)
            )
        }
    }
}