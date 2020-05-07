package com.mountblue.todokoinex

import retrofit2.Call
import retrofit2.http.GET

interface TodoApi {
    @GET("/todos")
    fun getTodos(): Call<Todos>
}