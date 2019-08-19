package com.talon.kaixue1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view = findViewById(R.id.view)
        printId(view)
    }

    private fun printId(view: View?) {
        Log.d("aaaa", (view?.id).toString()+"sss")
    }
}
