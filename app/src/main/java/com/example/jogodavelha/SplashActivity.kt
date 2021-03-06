package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer().schedule(2000) { abrirJogo() }
    }

    private fun abrirJogo() {

        val intent = Intent(this, EscolhaDeAdversario::class.java)
        startActivity(intent)
        finish()
    }
}