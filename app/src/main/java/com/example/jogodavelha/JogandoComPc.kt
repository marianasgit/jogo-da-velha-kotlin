package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JogandoComPc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogando_com_pc)

        val btnJogoFacil: Button = findViewById(R.id.jogoFacil)
        val btnJogoMedio: Button = findViewById(R.id.jogoMedio)
        val btnJogoDificil: Button = findViewById(R.id.jogoDificil)

//        var dificuldadeDeJogo = String();

        fun jogoEmAcao(dificuldade: String) {

            val intent = Intent(this, JogoEmAcaoPc::class.java)
            intent.putExtra("nivel", dificuldade)

            startActivity(intent)
            finish()
        }

       /* fun escolhaFacil() {

            val intent = Intent(this, JogoEmAcaoPc::class.java)
            startActivity(intent)
            finish()
        }*/

        btnJogoFacil.setOnClickListener {
//            dificuldadeDeJogo = "Fácil"
//            Timer().schedule(2000) { jogoEmAcao() }
            jogoEmAcao("Facil")
        }

        btnJogoMedio.setOnClickListener {
//            dificuldadeDeJogo = "Medio"
//            Timer().schedule(2000) { jogoEmAcao() }
            jogoEmAcao("Médio")
        }

        btnJogoDificil.setOnClickListener {
//            dificuldadeDeJogo = "Difícil"
//            Timer().schedule(2000) { jogoEmAcao() }
            jogoEmAcao("Dificil")
        }


    }
}