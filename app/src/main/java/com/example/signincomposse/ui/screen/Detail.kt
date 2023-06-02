package com.example.signincomposse.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signincomposse.ui.models.Task

@Composable
fun DetailScreen(){
    val listOfData = arrayListOf<Task>()

    listOfData.add(Task("title", "desc"))
    listOfData.add(Task("title", "desc"))
    listOfData.add(Task("title", "desc"))
    listOfData.add(Task("title", "desc"))
    listOfData.add(Task("title", "desc"))
    listOfData.add(Task("title", "desc"))
    listOfData.add(Task("title", "desc"))

    LazyColumn(){
        items(listOfData){
            TaskItem(item = it)
        }

      /*  itemsIndexed(listOfData){index, item ->
            TaskItem(item = item)
        }*/
    }
}

@Composable
fun TaskItem(item: Task){
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(text = item.title, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = item.desc, fontSize = 16.sp, modifier = Modifier.padding(top = 8.dp))

    }
}