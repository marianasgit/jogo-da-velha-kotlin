package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class JogoEmAcaoAmigo : AppCompatActivity() {
    var jogadorAtual = "X"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_em_acao)

       /* val intent: Intent = getIntent()

        val titulo = findViewById<TextView>(R.id.titulo)

        titulo.text = "Jogo da Velha - " + intent.getStringExtra("nivel")*/

        val buttons = arrayOf(
            findViewById<Button>(R.id.campo1),
            findViewById<Button>(R.id.campo2),
            findViewById<Button>(R.id.campo3),
            findViewById<Button>(R.id.campo4),
            findViewById<Button>(R.id.campo5),
            findViewById<Button>(R.id.campo6),
            findViewById<Button>(R.id.campo7),
            findViewById<Button>(R.id.campo8),
            findViewById<Button>(R.id.campo9),
        )

        buttons.forEach {
            it.setOnClickListener { it as Button
                it.text = jogadorAtual
                it.isEnabled = false
                it.setTextColor(getColor(R.color.black))

                proximoJogador()
            }
        }


    }

    private fun proximoJogador() {
        if (jogadorAtual == "X") {
            jogadorAtual = "O"
        }else{
            jogadorAtual = "X"
        }
    }
}