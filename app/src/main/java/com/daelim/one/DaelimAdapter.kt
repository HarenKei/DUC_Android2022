package com.daelim.one

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.daelim.one.databinding.ListItemLayoutBinding

class DaelimAdapter(val data : MutableList<DaelimData>):BaseAdapter() {
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(p0: Int): Any {
        return data[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //p0 position
        //p1 : 시작되면 초기값은 Null -> 스크롤을 하면서 기존의 뷰가 화면 밖으로 벗어나면 재활용되어 p1 입갤
        //즉 p1이 null이면 view가 처음 생성되는거다.

        if(p1 == null) {
            val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(p2!!.context))
            val d = data[p0]
            binding.imgNewImage.setImageResource(d.i)
            binding.tvNewName.text = d.name
            binding.tvNewDesc.text = d.desc

            var holder = DaelimViewHolder()
            holder.set(binding.imgNewImage, binding.tvNewName, binding.tvNewDesc)
            binding.root.tag = holder

            return binding.root
        }  else{
            var holder = p1.tag as DaelimViewHolder
            val d = data[p0]
            holder.image?.setImageResource(d.i)
            holder.name?.text = d.name
            holder.desc?.text = d.desc
            return p1
        }
    }
}