package com.example.jogodavelha

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import kotlin.concurrent.schedule

var adversarioEscolhido = String();

class EscolhaDeAdversario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_de_adversario)

        val btnJogoAmigo: Button = findViewById(R.id.jogoAmigo)
        val btnJogoPc: Button = findViewById(R.id.jogoPC)

        fun menuJogarComAmigo() {

            val intent = Intent(this, JogandoComAmigo::class.java)
            startActivity(intent)

        }

        fun menuJogarComPC() {

            val intent = Intent(this, JogandoComPc::class.java)
            startActivity(intent)

        }

        btnJogoAmigo.setOnClickListener {
            //btnJogoAmigo.background = getDrawable(R.drawable.botao_escuro)
            menuJogarComAmigo();
            adversarioEscolhido = "Amigo"
        }

        btnJogoPc.setOnClickListener {
            //btnJogoAmigo.background = getDrawable(R.drawable.botao_escuro)
            menuJogarComPC();
            adversarioEscolhido = "Pc"
        }

    }
}