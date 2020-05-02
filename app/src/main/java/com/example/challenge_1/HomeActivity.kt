package com.example.challenge_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var nama = findViewById(R.id.nama) as EditText
    var umur = findViewById(R.id.umur) as EditText
    var email = findViewById(R.id.email) as EditText
    var telp = findViewById(R.id.telp) as EditText
    var alamat = findViewById(R.id.alamat) as EditText
    val simpan = findViewById(R.id.simpan) as Button
    var namaId = findViewById(R.id.namaId) as TextView
    var jkId = findViewById(R.id.jkId) as TextView
    var umurId = findViewById(R.id.umurId) as TextView
    var emailId = findViewById(R.id.emailId) as TextView
    var telpId = findViewById(R.id.telpId) as TextView
    var alamatId = findViewById(R.id.alamatId) as TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
}
