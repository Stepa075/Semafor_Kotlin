package com.example.semafor_kotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import java.util.*

class MainActivity : Activity() {

    var imSemafor: ImageView? = null
    var counter: Int = 0
    var timer: Timer? = null
    var isRun = false
//    var imButton: ImageButton? = null
    var imageArray: IntArray = intArrayOf(R.drawable.semafor_red, R.drawable.semafor_yellow, R.drawable.semafor_green)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imSemafor = findViewById(R.id.im_Semafor)
//        imButton = findViewById(R.id.imButton)
    }

    fun onClickStartStop(view:View){
       view as ImageButton
       if(!isRun){
           startStop()
           view.setImageResource(R.drawable.button_stop)
           isRun = true
       }
       else{
           view.setImageResource(R.drawable.button_start)
           timer?.cancel()
           imSemafor?.setImageResource(R.drawable.semafor_grey)
           isRun = false
           counter = 0
       }


    }

    fun startStop(){
        timer = Timer()
        timer?.schedule(object :TimerTask(){
             override fun run() {
                runOnUiThread  {
                    imSemafor?.setImageResource(imageArray[counter])
                    counter++
                    if (counter == 3) counter = 0
                }
            }

        }, 0, 1000)
    }
}