package com.sanjoo.androidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanjoo.androidtraining.all.fragment1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment= fragment1()
    }
}