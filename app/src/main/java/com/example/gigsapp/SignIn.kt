package com.example.gigsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignIn : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPass: EditText
    lateinit var btnsign: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        castViews()
        clickButton()
    }
    fun castViews(){
        etEmail=findViewById(R.id.etEmail)
        etPass=findViewById(R.id.etPass)
        btnsign=findViewById(R.id.btnsign)
    }
    fun clickButton(){
        btnsign.setOnClickListener {
            if (etEmail.text.toString().isEmpty() || etPass.text.toString()
                    .isEmpty()){
                etEmail.setError("Email required")
                etPass.setError("Password required")
            }
            else{
                val intent=Intent(baseContext,Home::class.java)
                startActivity(intent)
            }

        }

    }
}