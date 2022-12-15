package com.daelim.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import com.daelim.one.databinding.ActivityReportAddressBinding
import com.daelim.one.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityTestBinding.inflate(layoutInflater)
    }

    private var result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result -> when(result.resultCode){
            1 -> { binding.tvTerms.text = "동의"}
            2 -> { binding.tvTerms.text = "비동의"}
        }
    }

    private var result2 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result2 -> when(result2.resultCode){
            1 -> { binding.tvTerms.text = "YEAH"}
            2 -> { binding.tvTerms.text = "슬프노..."}
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
            val termsIntent = Intent(this, TermsActivity::class.java)
            val terms2Intent = Intent(this, Temrs2Activity::class.java)
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.btTerms.setOnClickListener(object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    result.launch(termsIntent)
                }
            })

            binding.btTerms1.setOnClickListener(object : View.OnClickListener{
                override fun onClick(p0: View?) {
                    result2.launch(terms2Intent)
                }
            })
    }
}
