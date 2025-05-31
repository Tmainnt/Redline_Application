package com.example.redline_application

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cmdshow.setOnclickListener{ view->
            tvOutput.text = "Hello Android Studio"
            Toast.make.text(this, "Hello Android Studio", Toast.LENGHT_LONG).show()
        }
    }
}