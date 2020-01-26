package com.cheng.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.transition.TransitionManager
import android.view.View
import kotlinx.android.synthetic.main.activity_constraint_layout_group.*

class ConstraintLayoutGroup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout_group)


    }

    fun onStartClicked(view: View) {
        start.visibility = View.GONE
        group.visibility = View.VISIBLE
        val fade = Fade()
        fade.duration = 1000
        TransitionManager.beginDelayedTransition(root_layout, fade)
    }
}
