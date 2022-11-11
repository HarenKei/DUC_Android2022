package com.daelim.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daelim.one.databinding.ActivityCheckBoxBinding

class CheckBoxActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityCheckBoxBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        var cbResultList: MutableList<String> = mutableListOf<String>()

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rgFruit.setOnCheckedChangeListener{group, checkedId ->
            //매개변수 group은 rgFruit를 가리킨다.
            //checkedId의 type은 id(string)
            when(checkedId){
                R.id.rdWatermelon -> binding.tvRadioResult.text = "수박"
                R.id.rdBanana -> binding.tvRadioResult.text = "바나나"
                R.id.rdStrawberry -> binding.tvRadioResult.text = "딸기"
            }
        }

        binding.cbYes.setOnCheckedChangeListener{cbBox, isChecked ->
            //매개변수 cbBox는 cbYes를 가르킨다.
            //isChecked의 type은 boolean.
            if(isChecked) {
                cbResultList.add("예")
                binding.tvCbResult.text = cbResultList.toString().replace("[", "").replace("]","")

            } else{
                cbResultList.remove("예")
                binding.tvCbResult.text = cbResultList.toString().replace("[", "").replace("]","")
            }
        }
        binding.cbNo.setOnCheckedChangeListener{cbBox, isChecked ->
            //
            if(isChecked){
                cbResultList.add("아니오")
                binding.tvCbResult.text = cbResultList.toString().replace("[", "").replace("]","")
            } else {
                cbResultList.remove("아니오")
                binding.tvCbResult.text = cbResultList.toString().replace("[", "").replace("]","")
            }
        }
    }
}