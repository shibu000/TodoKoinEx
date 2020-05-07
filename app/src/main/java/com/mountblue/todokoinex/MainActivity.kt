package com.mountblue.todokoinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var textView : TextView
    private val myViewModel : TodoViewModel by inject()
    private var str: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.todoData)

        myViewModel.getListOfApps().observe(this, Observer {
            Log.d("Tag", it.toString());
            textView.text = it[0].title
        })
        
    }
}
