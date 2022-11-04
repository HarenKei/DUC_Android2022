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

    override fun onCreate(savedInstanceState: Bundle?) {
            val termsIntent = Intent(this, TermsActivity::class.java)
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.btTerms.setOnClickListener(object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    result.launch(termsIntent)
                }
            })
    }
}
