package com.cheng.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.BounceInterpolator
import kotlinx.android.synthetic.main.activity_place_holder.*

class PlaceHolder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_holder)
    }

    fun onPicClicked(view: View) {
        val transition = ChangeBounds()
        transition.interpolator = BounceInterpolator()
        transition.duration = 2000
        TransitionManager.beginDelayedTransition(root_layout_place, transition)
        place_holder.setContentId(view.id)
    }
}
