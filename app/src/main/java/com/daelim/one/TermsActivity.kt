package com.daelim.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import com.daelim.one.databinding.ActivityTermsBinding

class TermsActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityTermsBinding.inflate(layoutInflater)
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