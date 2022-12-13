package com.daelim.one
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daelim.one.databinding.RecyclerItemLayoutBinding
import java.text.FieldPosition

class RecyclerAdapter(val data : MutableList<DaelimData>) : RecyclerView.Adapter<RecyclerHolder>() {
    override fun getItemCount() : Int = data.size

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : RecyclerHolder{
        val bind = RecyclerItemLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return RecyclerHolder(bind)
    }
    override fun onBindViewHolder(holder:RecyclerHolder, position: Int){
        holder.bind(data[position])
        holder.binding.tvReName.text = data[position].name
        holder.binding.tvReDesc.text = data[position].desc
        holder.binding.imgReImage.setImageResource(data[position].i)
    }
}