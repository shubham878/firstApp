package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val name=intent.getStringExtra("EXTRA_NAME")
        val email=intent.getStringExtra("EXTRA_EMAIL")
        val phone=intent.getIntExtra("EXTRA_PHONE",0)
        val finalString="Hello $name ,email:$email ,phone:$phone"
        val id:TextView=findViewById(R.id.tv_person)
        id.text = finalString
        //val person=intent.getSerializableExtra("EXTRA_PERSON") as Person
        //id.text=person.toString()


    }
}