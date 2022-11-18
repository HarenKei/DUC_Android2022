package com.daelim.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.daelim.one.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityListBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //var var cbResultList: MutableList<String> = mutableListOf<String>()
        var lvValue: MutableList<String> = mutableListOf("Hyundai", "Tesla", "Kia", "Renault", "Porsche", "Rolls-Royce", "Ford", "Ferrari" )

        binding.lvItems.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lvValue)


    }
}