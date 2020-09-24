package edu.bo.guias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_guide_four_and_five.*

class guideFourAndFive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_four_and_five)

        supportActionBar.let {
            it?.setDisplayHomeAsUpEnabled(true)
            it?.setDisplayShowHomeEnabled(true)
        }
        supportActionBar.let {
            setSupportActionBar(toolbar)
        }

    }

}
