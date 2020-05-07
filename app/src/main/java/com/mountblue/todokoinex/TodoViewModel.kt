package com.mountblue.todokoinex

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel(private val repository: TodoRepository) : ViewModel() {

    fun getListOfApps():MutableLiveData<Todos>{
        return  repository.getTodoData()
    }
}