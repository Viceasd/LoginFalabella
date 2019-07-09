package com.viceasd.loginfalabella.adapter


import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.viceasd.loginfalabella.R
import com.viceasd.loginfalabella.data.dto.IndicadorDto
import com.viceasd.loginfalabella.models.Movies

class IndicadorListViewAdapter(private val activity: Activity, indicadorList: List<IndicadorDto>) : RecyclerView.Adapter<IndicadorListViewAdapter.MyViewHolder>()  {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nombre: TextView = view.findViewById<TextView>(R.id.title)
        var valor: TextView = view.findViewById<TextView>(R.id.year)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.listview, parent, false)

        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val indicador = indicadorList[position]
        holder.nombre.text = indicador.nombre
        holder.valor.text = indicador.valor

    }


    private var indicadorList = ArrayList<IndicadorDto>()

    init {
        this.indicadorList = indicadorList as ArrayList<IndicadorDto>
    }


    override fun getItemCount(): Int {
        return indicadorList.size
    }
}



