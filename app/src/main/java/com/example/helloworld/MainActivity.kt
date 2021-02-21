package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btcal = CalcularBt
        val resultado = resultado

        btcal.setOnClickListener {
            val Nota1: Int = Integer.parseInt(Nota1.text.toString())
            val Nota2: Int = Integer.parseInt(Nota2.text.toString())
            val media: Int = (Nota1 + Nota2)/2
            val Faltas: Int = Integer.parseInt(Faltas.text.toString())

            if(media >= 5){
                resultado.setText("Aluno Aprovado" + "\n" + "Parabéns, sua nota é $media" )
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("aluno Reprovado" + "\n" + "infelizmente, sua nota é $media")
                resultado.setTextColor(Color.RED)
            }

        }
    }
}