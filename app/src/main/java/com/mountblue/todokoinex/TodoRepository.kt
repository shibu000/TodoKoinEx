package com.mountblue.todokoinex

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.await

class TodoRepository(private val api : TodoApi) {

    fun getTodoData(): MutableLiveData<Todos> {
        val appsData = MutableLiveData<Todos>()
        GlobalScope.launch(Dispatchers.IO) {
            appsData.postValue(api.getTodos().await())
        }
        return appsData
    }
}