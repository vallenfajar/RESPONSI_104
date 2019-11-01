package com.example.responsi_104

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tampung_lagi_nama : String? = intent.getStringExtra("Nama")
        val tampung_lagi_username : String? = intent.getStringExtra("Username")
        val tampung_lagi_password : String? = intent.getStringExtra("Password")


        tv_isi_nama.text = ""+tampung_lagi_nama
        tv_isi_username.text = ""+tampung_lagi_username
        tv_isi_password.text = ""+tampung_lagi_password

        btn_back.setOnClickListener(){
            intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

    }
}
