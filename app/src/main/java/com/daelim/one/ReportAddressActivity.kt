package com.daelim.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daelim.one.databinding.ActivityReportAddressBinding

class ReportAddressActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityReportAddressBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        val addressIntent = Intent(this, ReportResultActivity::class.java)
        //intent 객체
        var usrName : String ?= ""
        var usrPhone : String ?= ""

        if(intent.hasExtra("phone") && intent.hasExtra("name")){
            usrName = intent.getStringExtra("name")
            usrPhone = intent.getStringExtra("phone")
        }

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btNext.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var usrAddress = binding.edAddress.text.toString()

                addressIntent.putExtra("name", usrName)
                addressIntent.putExtra("phone", usrPhone)
                addressIntent.putExtra("address", usrAddress)
                startActivity(addressIntent)
            }

        })


    }
}