package com.daelim.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daelim.one.databinding.ActivityReportPhoneBinding

class ReportPhoneActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityReportPhoneBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        val phoneIntent = Intent(this, ReportAddressActivity::class.java)
        //intent 객체 생성, ReportAddressActivity로 값 넘김
        var usrName : String ? = ""

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if(intent.hasExtra("name")){
            usrName = intent.getStringExtra("name")
        }

        binding.btNext.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var usrPhone = binding.edPhone.text.toString()
                phoneIntent.putExtra("phone", usrPhone)
                phoneIntent.putExtra("name", usrName)
                startActivity(phoneIntent)
            }
        })
    }
}