package com.example.tanyongrui.gittestname

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var hi = R.id.text
        Log.e("HI ", "HIII\n " + hi)
    }
}
