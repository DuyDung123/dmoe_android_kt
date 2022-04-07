package com.android.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_hello.*

class HelloActivity : AppCompatActivity() {
    var flag = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_hello)

        btnClick.setOnClickListener {
            val todoTitle = "xin chào đây là sự kiện click";
            val hello = "hello";
            if(todoTitle.isNotEmpty() && flag ==1) {
                flag = 2;
                edText.text = todoTitle;
            }
            if(todoTitle.isNotEmpty() && flag ==2) {
                flag = 1;
                edText.text = hello;
            }
        }
    }
}