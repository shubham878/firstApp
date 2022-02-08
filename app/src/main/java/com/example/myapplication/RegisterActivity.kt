package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnReg: Button = findViewById(R.id.btn_register)
        val etName:TextView=findViewById(R.id.personName)
        val etEmail:TextView=findViewById(R.id.email)
        val etPhone:TextView=findViewById(R.id.phone)

        btnReg.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val phoneString= etPhone.text.toString()
            if (name.isEmpty() || email.isEmpty() || phoneString.length!=10) {
                Toast.makeText(this, "enter all the fields", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val phone=phoneString.toInt()
                //val person = Person(name, email, phone)
                Intent(this, MainActivity::class.java).also {
                    it.putExtra("EXTRA_NAME",name)
                    it.putExtra("EXTRA_EMAIL",email)
                    it.putExtra("EXTRA_PHONE",phone)
                    //it.putExtra("EXTRA_PERSON", person)
                    startActivity(it)
                }

            }
        }





    }

    }
