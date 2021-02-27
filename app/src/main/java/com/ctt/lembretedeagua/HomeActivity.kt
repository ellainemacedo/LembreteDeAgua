package com.ctt.lembretedeagua

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var botaoCadastrar: Button
    private lateinit var pesoUsuario: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val botaoCadastrar = findViewById<Button>(R.id.btnCadastrar)
        val pesoUsuario = findViewById<EditText>(R.id.edtPesoUsuario)

        botaoCadastrar.setOnClickListener {
            val pesoDigitado = pesoUsuario.text.toString()

            if (!pesoDigitado.isEmpty()) {
                val resultado = calculo(pesoDigitado.toDouble())

            redirecionar(resultado)
            }
        }

    }

    fun calculo(peso: Double): Double {
        return peso * 0.035
    }


    fun redirecionar(resultado: Double) {
        val chaveResultado = "RESULTADO"

        val destinoActivity = Intent(this, CalculoActivity::class.java)
        destinoActivity.putExtra(chaveResultado, resultado)
        // Inicia uma nova Activity
        startActivity(destinoActivity)
        // Encerra a Activity ATUAL (MainActivity)
        finish()


    }
}