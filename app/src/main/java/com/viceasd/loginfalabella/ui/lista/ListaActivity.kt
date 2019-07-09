package com.viceasd.loginfalabella.ui.lista

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.viceasd.loginfalabella.R
import com.viceasd.loginfalabella.adapter.MoviesListViewAdapter
import com.viceasd.loginfalabella.models.Movies
import androidx.recyclerview.widget.RecyclerView
import com.viceasd.loginfalabella.adapter.IndicadorListViewAdapter
import com.viceasd.loginfalabella.data.dto.IndicadorDto


class ListaActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    var listView: ListView? = null
    var movieList = ArrayList<Movies>()
    var indicadorList = ArrayList<IndicadorDto>()
    var adapter: MoviesListViewAdapter? = null
    var adapter2: IndicadorListViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)




        recyclerView = findViewById(R.id.recyclerView) as RecyclerView
       // adapter = MoviesListViewAdapter(this, movieList)
        adapter2 = IndicadorListViewAdapter(this, indicadorList)

        val mLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView!!.layoutManager = mLayoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        recyclerView!!.adapter = adapter

      //  (listView as ListView).adapter = adapter

        prepareMovieData()

    }


    private fun prepareMovieData() {
        var movie = Movies("Mad Max: Fury Road", "Action & Adventure", "2015")
        movieList.add(movie)

        movie = Movies("Inside Out", "Animation, Kids & Family", "2015")
        movieList.add(movie)

        movie = Movies("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        movieList.add(movie)

        movie = Movies("Shaun the Sheep", "Animation", "2015")
        movieList.add(movie)

        movie = Movies("The Martian", "Science Fiction & Fantasy", "2015")
        movieList.add(movie)

        movie = Movies("Mission: Impossible Rogue Nation", "Action", "2015")
        movieList.add(movie)

        movie = Movies("Up", "Animation", "2009")
        movieList.add(movie)

        movie = Movies("Star Trek", "Science Fiction", "2009")
        movieList.add(movie)

        movie = Movies("The LEGO Movies", "Animation", "2014")
        movieList.add(movie)

        movie = Movies("Iron Man", "Action & Adventure", "2008")
        movieList.add(movie)

        movie = Movies("Aliens", "Science Fiction", "1986")
        movieList.add(movie)

        movie = Movies("Chicken Run", "Animation", "2000")
        movieList.add(movie)

        movie = Movies("Back to the Future", "Science Fiction", "1985")
        movieList.add(movie)

        movie = Movies("Raiders of the Lost Ark", "Action & Adventure", "1981")
        movieList.add(movie)

        movie = Movies("Goldfinger", "Action & Adventure", "1965")
        movieList.add(movie)

        movie = Movies("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
        movieList.add(movie)

        adapter?.notifyDataSetChanged()
    }

}
