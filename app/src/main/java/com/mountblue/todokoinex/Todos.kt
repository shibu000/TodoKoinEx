package com.mountblue.todokoinex

class Todos : ArrayList<TodosItem>()

data class TodosItem(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)