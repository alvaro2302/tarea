package edu.bo.guias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGotoTwoAndThree = findViewById<Button>(R.id.guideTo2)
         buttonGotoTwoAndThree.setOnClickListener{

            val intent = Intent(this@MainActivity,GuideTwoAndThree::class.java)
            startActivity(intent)
        }




    }
}