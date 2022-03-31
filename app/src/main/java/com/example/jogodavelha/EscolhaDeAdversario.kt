package com.example.jogodavelha

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EscolhaDeAdversario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_de_adversario)

        val button: Button = findViewById(R.id.jogoAmigo)

        button.setOnClickListener {
            button.background = getDrawable(R.drawable.botao_escuro)

            fun menuJogarComAmigo() {

                val intent = Intent(this, JogandoComAmigo::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}