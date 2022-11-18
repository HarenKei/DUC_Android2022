package com.daelim.one

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.daelim.one.databinding.ActivityCustomListViewBinding

data class movieData (
    val image: Int,
    var title : String,
    var disc : String
){}


class CustomListViewActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityCustomListViewBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataList = mutableListOf<movieData>()
        dataList.add(movieData(R.drawable.parasite, "기생충", "송강호"))
        dataList.add(movieData(R.drawable.sinsegye, "신세계", "황정민 이정재"))
        dataList.add(movieData(R.drawable.surinam, "수리남", "황정민 하정우"))
        dataList.add(movieData(R.drawable.topgun, "탑건:매버릭", "톰 크루즈"))
        dataList.add(movieData(R.drawable.todaytomorrow, "나는 오늘 어제의 너와 만난다", "고마츠 나나"))

        binding.lvMovieList.adapter = MyAdapter(this, dataList)
    }
}