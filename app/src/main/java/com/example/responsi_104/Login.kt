package com.example.responsi_104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_register.setOnClickListener {
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        val Username: EditText = findViewById(R.id.et_username)
        val Password: EditText = findViewById(R.id.et_pass)

        val tampung_nama : String? = intent.getStringExtra("Nama")
        val tampung_username : String? = intent.getStringExtra("Username")
        val tampung_password : String? = intent.getStringExtra("Password")

        btn_signin.setOnClickListener() {
            if (Username.getText().toString() == intent.getStringExtra("Username") && Password.getText().toString() == intent.getStringExtra("Password")) {
                intent = Intent(this, Home::class.java)
                intent.putExtra("Nama", tampung_nama.toString())
                intent.putExtra("Username", tampung_username.toString())
                intent.putExtra("Password", tampung_password.toString())
                startActivity(intent)
            }else{
                Toast.makeText(this,"username & password is wrong", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }
}
