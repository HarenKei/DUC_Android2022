package com.daelim.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daelim.one.databinding.ActivityMainBinding

class IntroActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}