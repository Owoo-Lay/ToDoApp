package com.nwanneka.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        profileButton = findViewById(R.id.profileButton)

        usernameDisplay = findViewById(R.id.usernameDisplay)



        usernameDisplay.text = intent.getStringExtra("name")
    }
}