package com.nwanneka.todoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val validUsername = "admin"
    val validPassword = "admin"

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.usernameinput)
        passwordInput = findViewById(R.id.passwordinput)
        submitButton = findViewById(R.id.submitbutton)

        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }
    }

    private fun login(username: String, password: String){
        if(isvalidcredentials(username, password)){
            val intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("name", username)
            startActivity(intent)



        }else{
            Toast.makeText(applicationContext, "Something went wrong", Toast.LENGTH_LONG).show()
        }

    }

    private fun isvalidcredentials(username: String, password: String): Boolean {
        return (username == validUsername && password == validPassword)
    }
}
