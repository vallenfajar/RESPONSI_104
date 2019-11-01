package com.example.responsi_104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama : EditText =  findViewById<EditText>(R.id.et_nama_register)
        val username : EditText =  findViewById<EditText>(R.id.et_username_register)
        val password : EditText =  findViewById<EditText>(R.id.et_pass_register)

        btn_register.setOnClickListener(){
            intent = Intent(this,Login::class.java)
            var cek_nama = nama.getText().toString()
            var cek_username = username.getText().toString()
            var cek_pass = password.getText().toString()

            if (cek_nama.isEmpty() || cek_username.isEmpty() || cek_pass.isEmpty()){
                Toast.makeText(this,"Please Input Information", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            intent.putExtra("Nama",nama.getText().toString())
            intent.putExtra("Username",username.getText().toString())
            intent.putExtra("Password",password.getText().toString())

            Toast.makeText(this, "Register is succesful",Toast.LENGTH_SHORT).show()

            startActivity(intent)
        }
    }
}
