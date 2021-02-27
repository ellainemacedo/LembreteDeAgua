package com.ctt.lembretedeagua

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.lembretedeagua.model.Beneficios

class BeneficiosAdapter(private val listaBeneficios: MutableList<Beneficios>) :
    RecyclerView.Adapter<BeneficiosAdapter.BeneficiosHolder>() {


    // PRIMEIRO PASSO A SER LIDO
    // Item final a ser visualizado e inserido na Recycler
    class BeneficiosHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo: TextView = view.findViewById(R.id.txtTitulo)
        val descricao: TextView = view.findViewById(R.id.txtDescricao)


    }

    // Equivalente ao Oncreate da Activity, só que no caso, da nosa célula/item
    // Da RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeneficiosHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_beneficio, parent, false)

        return BeneficiosHolder(view)
    }

    // Responsavel por VINCULAR os dados com os componentes  do xml
    // Contato da lista = texto de contato do xml
    override fun onBindViewHolder(holder: BeneficiosHolder, position: Int) {

        holder.titulo.text = listaBeneficios[position].titulo
        holder.descricao.text = listaBeneficios[position].descricao
    }

    override fun getItemCount(): Int {
        return listaBeneficios.size
    }


}

