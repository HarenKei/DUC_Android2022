package com.daelim.one

import android.content.Context
import android.util.Log
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
        Log.e("!!!", "position ${position}")
        /*
        val adapterBinding = MovieListBinding.inflate(LayoutInflater.from(parent!!.context))
        adapterBinding.imgPoster.setImageResource(items[position].image)
        adapterBinding.tvTitle.text = items[position].title
        adapterBinding.tvDisc.text = items[position].disc

        //ViewHolder 객체 생성
        var holder = vHolder()
        holder.set(adapterBinding.imgPoster, adapterBinding.tvTitle, adapterBinding.tvDisc)
        adapterBinding.root.tag = holder

        return adapterBinding.root
        */

        //view가 비어있을 때 viewHolder 객체를 생성해서 widget을 설정해주고 비어있지 않다면 저장된 viewHolder 객체를 가져와서 재사용이 가능해집니다.

        if(view == null){
            //어댑터에 대한 바인딩
            val adapterBinding = MovieListBinding.inflate(LayoutInflater.from(parent!!.context))
            adapterBinding.imgPoster.setImageResource(items[position].image)
            adapterBinding.tvTitle.text = items[position].title
            adapterBinding.tvDisc.text = items[position].disc

            //ViewHolder 객체 생성
            var holder = vHolder()
            holder.set(adapterBinding.imgPoster, adapterBinding.tvTitle, adapterBinding.tvDisc)
            adapterBinding.root.tag = holder

            return adapterBinding.root
        } else{
            var holder = view.tag as vHolder
            val data = items[position]
            holder.image?.setImageResource(data.image)
            holder.title?.text = data.title
            holder.description?.text = data.disc
            return view
        }
    }
}