package com.abhishekb.devcreateproject

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Carousel1:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.carousel_1)

        val btn=findViewById<TextView>(R.id.next_1)
        btn.setOnClickListener{
            val intent= Intent(this,Carousel2::class.java)
            startActivity(intent)
            finish()
        }
    }
}