package com.example.mytopten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra name"
        const val EXTRA_EMAIL = "extra email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        about_name.text = name
        about_email.text = email
    }
}