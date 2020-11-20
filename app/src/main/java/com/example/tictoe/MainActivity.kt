package com.example.tictoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.ThemeTicToe)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}