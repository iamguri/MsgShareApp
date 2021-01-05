package com.example.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShowToast.setOnClickListener{
            //code this sOL is a Lambda Expression
            Log.i("MainActivity", "Button was clicked !")
            //log.i will store the logs in logcat message as Button was clicked

            Toast.makeText(this, "This Button was clicked", Toast.LENGTH_SHORT).show()
        }
    }
}