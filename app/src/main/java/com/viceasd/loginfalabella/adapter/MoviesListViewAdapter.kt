package com.viceasd.loginfalabella.adapter


import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.viceasd.loginfalabella.R
import com.viceasd.loginfalabella.models.Movies

class MoviesListViewAdapter(private val activity: Activity, moviesList: List<Movies>) : RecyclerView.Adapter<MoviesListViewAdapter.MyViewHolder>()  {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById<TextView>(R.id.title)
        var year: TextView = view.findViewById<TextView>(R.id.year)
        var genre: TextView = view.findViewById<TextView>(R.id.genre)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.listview, parent, false)

        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val Movies = moviesList[position]
        holder.title.text = Movies.title
        holder.genre.text = Movies.genre
        holder.year.text = Movies.year
    }


    private var moviesList = ArrayList<Movies>()

    init {
        this.moviesList = moviesList as ArrayList<Movies>
    }


    override fun getItemCount(): Int {
        return moviesList.size
    }
}



