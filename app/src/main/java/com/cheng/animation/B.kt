package com.cheng.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class B : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_right_out)
    }
}
