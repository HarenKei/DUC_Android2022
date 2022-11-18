package com.daelim.one

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.daelim.one.databinding.MovieListBinding

class MyAdapter(val context : Context, private val items : MutableList<movieData>) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val adapterBinding = MovieListBinding.inflate(LayoutInflater.from(parent!!.context))
        adapterBinding.imgPoster.setImageResource(items[position].image)
        adapterBinding.tvTitle.text = items[position].title
        adapterBinding.tvDisc.text = items[position].disc

        return adapterBinding.root
    }
}