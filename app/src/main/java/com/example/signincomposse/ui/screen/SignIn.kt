package com.example.signincomposse.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signincomposse.R
import com.example.signincomposse.ui.theme.SignInColor

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SignInScreen() {
    var text by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(top = 40.dp)) {
            Text(
                text = "Hello,\n" +
                        "Welcome!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 110.dp, start = 50.dp, end = 40.dp)

            )
            Image(painter = painterResource(id = R.drawable.illustration_2), contentDescription = "" )
        }
        TextField(value = text, onValueChange = {text = it}, colors =TextFieldDefaults.textFieldColors(placeholderColor = Color.White), modifier = Modifier.background(
            Color.White)
        )
        Button(
            onClick = { },
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(SignInColor),
            modifier = Modifier
                .padding(top = 120.dp)
        ) {
            Text(
                text = "Sign in",
                fontSize = 40.sp,
            )
        }
    }
}