package com.daelim.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daelim.one.databinding.ActivityMainBinding
import com.daelim.one.databinding.ActivityReportNameBinding

class ReportNameActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityReportNameBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val intent = Intent(this, ReportPhoneActivity::class.java)
        //intent 객체 생성, 페이지는 Phone
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.btNext.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var usrName = binding.edName.text.toString()
                intent.putExtra("name", usrName)
                startActivity(intent)
            }

        })




    }
}