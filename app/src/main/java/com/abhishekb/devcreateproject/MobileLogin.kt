package com.abhishekb.devcreateproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.FirebaseException
import com.google.firebase.auth.*
import java.util.concurrent.TimeUnit

class MobileLogin : AppCompatActivity() {

    private lateinit var phone_no : TextInputEditText
    private lateinit var mAuth : FirebaseAuth
    private lateinit var callbacks : PhoneAuthProvider.OnVerificationStateChangedCallbacks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile_login)

        mAuth = FirebaseAuth.getInstance()


        phone_no  =  findViewById(R.id.phoneNo)
        val sendBtn = findViewById<Button>(R.id.button)

        sendBtn.setOnClickListener {
            if(phone_no.text.toString().trim().length != 10)
            {
                Toast.makeText(this,"Enter a valid Phone Number",Toast.LENGTH_LONG).show()
            }
            else{
                    sendOtp();
            }
        }
    }

    private fun sendOtp() {
        callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

            override fun onVerificationCompleted(credential: PhoneAuthCredential) {

//                signInWithPhoneAuthCredential(credential)
            }

            override fun onVerificationFailed(e: FirebaseException) {

                Toast.makeText(this@MobileLogin,"Phone Authentication Failed + ${e}",Toast.LENGTH_LONG).show()

            }

            override fun onCodeSent(
                verificationId: String,
                token: PhoneAuthProvider.ForceResendingToken
            ) {

                startActivity(Intent(this@MobileLogin,EnterOtpActivity::class.java)
                    .putExtra("phoneNumber",phone_no.text.toString().trim())
                    .putExtra("verification_id",verificationId))

            }

        }
        val options = PhoneAuthOptions.newBuilder(mAuth)
            .setPhoneNumber("+91"+phone_no.text.toString().trim()) // Phone number to verify
            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
            .setActivity(this@MobileLogin) // Activity (for callback binding)
            .setCallbacks(callbacks)          // OnVerificationStateChangedCallbacks
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)

    }
}