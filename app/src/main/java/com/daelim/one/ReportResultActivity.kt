package com.daelim.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daelim.one.databinding.ActivityMainBinding
import com.daelim.one.databinding.ActivityReportResultBinding

class ReportResultActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityReportResultBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        var usrName : String ?= ""
        var usrPhone : String ?= ""
        var usrAddress : String ?= ""

        if(intent.hasExtra("name") && intent.hasExtra("phone") && intent.hasExtra("address")){
            usrName = intent.getStringExtra("name").toString()
            usrPhone = intent.getStringExtra("phone").toString()
            usrAddress = intent.getStringExtra("address").toString()
        }

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvResult1.text = usrName
        binding.tvResult2.text = usrPhone
        binding.tvResult3.text = usrAddress
    }
}