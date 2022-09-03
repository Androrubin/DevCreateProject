package com.abhishekb.devcreateproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class EnterOtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_otp)

        val textview = findViewById<TextView>(R.id.textView2)
        textview.text = "Enter the OTP sent to your phone number  ${intent.getStringExtra("phoneNumber")}"
        val otp = findViewById<TextInputEditText>(R.id.otp)
        val continueBtn = findViewById<Button>(R.id.button)
        continueBtn.setOnClickListener {

            if (otp.text!!.isNotEmpty() || otp.text.toString().length != 6) {
                startActivity(Intent(this@EnterOtpActivity, MainActivity::class.java))
            } else {
                Toast.makeText(this, "Enter the correct OTP", Toast.LENGTH_LONG).show()
            }
        }
    }
}