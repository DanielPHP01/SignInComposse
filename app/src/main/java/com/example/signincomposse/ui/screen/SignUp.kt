package com.example.signincomposse.ui.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
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
fun SignUpScreen(
    navigationSignIn: () -> Unit
) {
    var nameText by remember {
        mutableStateOf("")
    }
    var emailText by remember {
        mutableStateOf("")
    }
    var passwordTwxt by remember {
        mutableStateOf("")
    }
    var conifrmPasswordText by remember {
        mutableStateOf("")
    }
    val passwordVisible by rememberSaveable { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.women), contentDescription = "",
        )

        Text(
            text = "Registration",
            fontSize = 30.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 10.dp)
        )
        TextField(
            value = nameText,
            onValueChange = { nameText = it },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
            placeholder = {
                Text(
                    text = "Name",
                    color = TextFieldColorPlaceHolder
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
        )
        TextField(
            value = emailText,
            onValueChange = { emailText = it },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
            placeholder = {
                Text(
                    text = "Email",
                    color = TextFieldColorPlaceHolder
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
        )
        TextField(
            value = passwordTwxt,
            onValueChange = { passwordTwxt = it },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
            placeholder = {
                Text(
                    text = "Password",
                    color = TextFieldColorPlaceHolder
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            keyboardActions = KeyboardActions(),
        )
        TextField(
            value = conifrmPasswordText,
            onValueChange = { conifrmPasswordText = it },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
            placeholder = {
                Text(
                    text = "Confirm password",
                    color = TextFieldColorPlaceHolder
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            keyboardActions = KeyboardActions(),
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Button(
                onClick = { navigationSignIn.invoke() },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(SignInColor),
                modifier = Modifier.padding(top = 30.dp),
            ) {
                Text(
                    text = "Sign up",
                    fontSize = 25.sp,
                )
            }
        }
    }
    BackHandler {

    }
}