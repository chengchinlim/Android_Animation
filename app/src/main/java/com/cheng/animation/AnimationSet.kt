package com.cheng.animation

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import android.view.animation.TranslateAnimation
import androidx.appcompat.app.AppCompatActivity

class AnimationSet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_set)

    }

    fun onHelloClicked(view: View) {
        val translate = TranslateAnimation(0f, 200f, 0f, 200f)
        val rotate = RotateAnimation(0f, 360f)
        val scale = ScaleAnimation(0f, 3f, 0f, 3f)

        val animationSet = AnimationSet(this, null)
        animationSet.addAnimation(translate)
        animationSet.addAnimation(rotate)
        animationSet.addAnimation(scale)
        animationSet.duration = 2000

        view.startAnimation(animationSet)
    }
}
