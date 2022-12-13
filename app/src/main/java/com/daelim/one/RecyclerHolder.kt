package com.daelim.one

import androidx.recyclerview.widget.RecyclerView
import com.daelim.one.databinding.RecyclerItemLayoutBinding

class RecyclerHolder (val binding : RecyclerItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(data: DaelimData){
        binding.tvReName.text = data.name
        binding.tvReDesc.text = data.desc
        binding.imgReImage.setImageResource(data.i)
    }

}