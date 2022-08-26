package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clearTextNum1(view: View) {}
    fun clearTextNum2(view: View) {}
    fun doSum(view: View) {}
    fun doSub(view: View) {}
    fun doDiv(view: View) {}
    fun doMul(view: View) {}
    fun doMod(view: View) {}
    fun doPow(view: View) {}
}