package com.example.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener() {
            showTimerPickerDialog()
        }
    }

    private  fun showTimerPickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener{Activity,hour,minute->
                    if(hour>=2&&hour<=9){
                        textView.text="おはよう"}
                    else if(hour>=10&&hour<=17){
                        textView.text="こんにちは"}
                    else{
                        textView.text="こんばんは"}},
                13,0,true
        )
        timePickerDialog.show()
    }
}