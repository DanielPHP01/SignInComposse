package com.example.signincomposse.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signincomposse.R
import com.example.signincomposse.ui.theme.SignInColor
import com.example.signincomposse.ui.theme.TextFieldColorPlaceHolder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    navigationDetail: () -> Unit,
) {
    var text by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    val passwordVisible by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 40.dp)
        ) {
            Text(
                text = "Hello,\n" + "Welcome!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 100.dp, start = 20.dp, end = 20.dp)

            )
            Image(
                painter = painterResource(id = R.drawable.illustration_2), contentDescription = ""
            )
        }
        TextField(
            value = text,
            onValueChange = { text = it },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
            placeholder = {
                Text(
                    text = "Phone Number or Email",
                    color = TextFieldColorPlaceHolder
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
            placeholder = {
                Text(
                    text = "Password",
                    color = TextFieldColorPlaceHolder
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            keyboardActions = KeyboardActions(),
        )
        Button(
            onClick = { navigationDetail.invoke() },
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(SignInColor),
            modifier = Modifier.padding(top = 140.dp),

            ) {
            Text(
                text = "Sign in",
                fontSize = 30.sp,
            )
        }
        Text(
            text = "or Sign in with",
            color = TextFieldColorPlaceHolder,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.social_media),
            contentDescription = "",
            modifier = Modifier
                .padding(20.dp)
                .size(150.dp),
        )
    }
}