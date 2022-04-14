package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class JogandoComAmigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogando_com_amigo)
        Timer().schedule(2000) { jogoEmAcaoAmigo() }
    }

    fun jogoEmAcaoAmigo() {

            val intent = Intent(this, JogoEmAcaoAmigo::class.java)
            startActivity(intent)
            finish()
        }
}