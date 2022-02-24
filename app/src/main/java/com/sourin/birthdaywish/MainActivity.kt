package com.sourin.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createBirthDayCard(view: View){
        val nameInput = name.editableText.toString()
        Toast.makeText(this,"Happy Birthday Dear $nameInput",Toast.LENGTH_LONG).show()

        val intent = Intent(this,BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.NAME_EXTRA,nameInput) // using key : isme hum ek bundle mein pack krke samaan ko dusre intent mein bhej sakte hai
        startActivity(intent)
    }
}