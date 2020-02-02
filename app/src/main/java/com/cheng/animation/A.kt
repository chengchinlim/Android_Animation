package com.cheng.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class A : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    fun onAClicked(view: View) {
        startActivity(Intent(this, B::class.java))
        overridePendingTransition(R.anim.slide_right_in, R.anim.slide_left_out)
    }
}
