package com.ctt.lembretedeagua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.lembretedeagua.model.Beneficios
import kotlinx.android.synthetic.main.activity_calculo.*

class CalculoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)


        val resultado = intent.extras?.get("RESULTADO")

        // \n = Quebra de linha em uma String
        txtResultado.text = "$resultado litros / dia"

        //setContentView(R.layout.activity_calculo)

        /*  // DADOS
        val listaConversa = mutableListOf<Beneficios>(
          Beneficios("ABCABC", "DESCRIÇÃO")
        )
        val rvConversas = findViewById<RecyclerView>(R.id.listaContatos)
        rvConversas.adapter = BeneficiosAdapter(listaConversa)
        //1. LinearLayout = Dispor os elementos em coluna unica na vertical ou horizontal
        //2. GrideLayout = Dispor os elemntos em mais de uma coluna, como um tabela
        //3. StaggeredGridLayout = Dispor os elementos em mais de uma coluna, tem tamanho fixo
        rvConversas.layoutManager = LinearLayoutManager(this)
    }
    */
    }
}