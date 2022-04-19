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

        var jogador1 = arrayListOf<Int>();
        var jogador2 = arrayListOf<Int>();


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

                validarGanhador(buttons)


                proximoJogador()
            }
        }

    }

    private fun validarGanhador (buttons:Array<Button>) {

        if(buttons[0].text == "X" && buttons[1].text == "X" && buttons[2].text == "X" ||
           buttons[3].text == "X" && buttons[4].text == "X" && buttons[])


    }

    private fun proximoJogador() {
        if (jogadorAtual == "X") {
            jogadorAtual = "O"
        }else{
            jogadorAtual = "X"
        }
    }
}