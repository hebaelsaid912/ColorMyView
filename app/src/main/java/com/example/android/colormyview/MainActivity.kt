package com.example.android.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.security.AlgorithmConstraints

class MainActivity : AppCompatActivity() {
    lateinit var constraintLayout: ConstraintLayout
    lateinit var boxOneText:TextView
    lateinit var boxTwoText:TextView
    lateinit var boxThreeText:TextView
    lateinit var boxFourText:TextView
    lateinit var boxFiveText:TextView
    lateinit var redBtn:Button
    lateinit var greenBtn:Button
    lateinit var yellowBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constraintLayout = findViewById(R.id.constraint_layout)
        boxOneText = findViewById(R.id.boxOneText)
        boxTwoText = findViewById(R.id.boxTwoText)
        boxThreeText = findViewById(R.id.boxThreeText)
        boxFourText = findViewById(R.id.boxFourText)
        boxFiveText = findViewById(R.id.boxFiveText)
        redBtn = findViewById(R.id.redBtn)
        greenBtn = findViewById(R.id.greenBtn)
        yellowBtn = findViewById(R.id.yellowBtn)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            boxOneText,
            boxTwoText,
            boxThreeText,
            boxFourText,
            boxFiveText,
            constraintLayout,
            redBtn,
            greenBtn,
            yellowBtn
        )

        for (items in clickableViews){
            items.setOnClickListener{makeColored(it)}
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoText -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.redBtn -> boxThreeText.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.yellowBtn -> boxFourText.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.greenBtn -> boxFiveText.setBackgroundResource(android.R.color.holo_green_dark)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}