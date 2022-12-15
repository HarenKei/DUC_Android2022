package com.daelim.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daelim.one.databinding.ActivityTemrs2Binding


class Temrs2Activity : AppCompatActivity() {
    private val binding by lazy {
        ActivityTemrs2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btAgree.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                setResult(1)
                finish()
            }
        })

        binding.btDegree.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                setResult(2)
                finish()
            }
        })
    }
}