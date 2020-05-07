package com.mountblue.todokoinex

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val viewModule : Module = module {
   viewModel { TodoViewModel(get()) }
}

val networkModule: Module = module {
   single { retrofit() }
}

val module: Module = module{
   single {TodoRepository(get())}
}

fun retrofit(): TodoApi{
   return  Retrofit.Builder()
           .baseUrl("https://jsonplaceholder.typicode.com")
           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
           .addConverterFactory(GsonConverterFactory.create())
           .build()
           .create(TodoApi::class.java)
}
