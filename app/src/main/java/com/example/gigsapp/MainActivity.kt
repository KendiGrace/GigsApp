package com.example.gigsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var etFull:EditText
    lateinit var spCountry:Spinner
    lateinit var etIdentity:EditText
    lateinit var etInstitution:EditText
    lateinit var etMember:EditText
    lateinit var etEmaill:EditText
    lateinit var etPass:EditText
    lateinit var etSkills:EditText
    lateinit var btnRegister:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        clickButton()
    }
    fun castViews(){
        etFull=findViewById(R.id.etFull)
        etIdentity=findViewById(R.id.etIdentity)
        etInstitution=findViewById(R.id.etInstitution)
        etMember=findViewById(R.id.etMember)
        etEmaill=findViewById(R.id.etEmaill)
        etPass=findViewById(R.id.etPass)
        etSkills=findViewById(R.id.etSkills)
        btnRegister=findViewById(R.id.btnRegister)
        spCountry=findViewById(R.id.spCountry)

        var country= arrayOf("choose country","Bali","Phillipines","Maldives","Zanzibar","CapeTown","Seychelles")
        var countryAdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, country)
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spCountry.adapter = countryAdapter

    }
    fun clickButton() {
        btnRegister.setOnClickListener {
            if (etFull.text.toString().isEmpty() || etEmaill.text.toString()
                    .isEmpty() || etPass.text.toString()
                    .isEmpty() || etInstitution.text.toString()
                    .isEmpty() || etMember.text.toString()
                    .isEmpty() || etSkills.text.toString()
                    .isEmpty() || etIdentity.text.toString()
                    .isEmpty()
            ) {
                etFull.setError("Full Name required")
                etEmaill.setError("Email required")
                etPass.setError("Password required")
                etMember.setError("Enter Instituition number")
                etInstitution.setError("Enter institution")
                etIdentity.setError("Identification number required")
                etSkills.setError("Enter your skills")
            } else {
                val intent = Intent(baseContext, SignIn::class.java)
                startActivity(intent)


            }

        }
    }

}