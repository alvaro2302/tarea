package edu.bo.guias

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout

class GuideTwoAndThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_two_and_three)

        val buttonRed = findViewById<Button>(R.id.btnRed)
        val buttonWhite = findViewById<Button>(R.id.btnWhite)
        val mealLayout = findViewById<ConstraintLayout>(R.id.guideT)

        val buttonFiveFour = findViewById<Button>(R.id.buttonGuideFourFIve)
        buttonRed.setOnClickListener{

            mealLayout.setBackgroundColor(Color.RED)
        }
        buttonWhite.setOnClickListener{

            mealLayout.setBackgroundColor(Color.WHITE)
        }

        buttonFiveFour.setOnClickListener{

            val intent = Intent(this@GuideTwoAndThree,guideFourAndFive::class.java)
            startActivity(intent)
        }


    }
}