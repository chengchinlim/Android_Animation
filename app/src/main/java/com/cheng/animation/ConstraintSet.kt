package com.cheng.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_constraint_set.*

class ConstraintSet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_set)
    }

    fun onStartClicked(view: View) {
        val set = ConstraintSet()
        set.clone(this, R.layout.second_keyframe)
        set.applyTo(root_layout_set)
        val transition = ChangeBounds()
        transition.interpolator = OvershootInterpolator()
        transition.duration = 2000
        TransitionManager.beginDelayedTransition(root_layout_set, transition)
    }
}
