package com.cheng.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_organized_animation.*

class OrganizedAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organized_animation)
    }

    fun onStartClicked(view: View) {
        val animation1 = AnimationUtils.loadAnimation(this, R.anim.animate_one)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.animate_two)
        val animationRoot = AnimationUtils.loadAnimation(this, R.anim.animate_root)

        view.startAnimation(animation1)
        image.startAnimation(animation2)
        root_layout_organized.startAnimation(animationRoot)
    }
}
