package com.daelim.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daelim.one.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val intent = Intent(this, ReportNameActivity::class.java)
        val testIntent = Intent(this, TestActivity::class.java)
        val ckboxIntent = Intent(this, CheckBoxActivity::class.java)
        val ListViewIntent = Intent(this, )
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btTest.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                binding.tvText.text = binding.edTest.text.toString()
            }

        })

        binding.btTest1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(intent)
            }

        })

        binding.btTest2.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(testIntent)
            }
        })

        binding.btTest3.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(ckboxIntent)
            }
        })

        binding.btListView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(ckboxIntent)
            }
        })
    }
}