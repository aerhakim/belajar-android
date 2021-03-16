package com.arhakim.materifintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        var bundle :Bundle?=intent.extras
        val nama = intent.getStringArrayExtra("nama", "")
    }
}