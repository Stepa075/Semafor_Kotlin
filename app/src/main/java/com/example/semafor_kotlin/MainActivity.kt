package com.example.semafor_kotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : Activity() {

    var imSemafor: ImageView? = null
    var imButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imSemafor = findViewById(R.id.im_Semafor)
        imButton = findViewById(R.id.imButton)
    }

    fun onClickStartStop(view:View){
    imSemafor.setImageResource()
    }
}