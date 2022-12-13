package com.daelim.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.daelim.one.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private val recyclerViewBinding by lazy {
        ActivityRecyclerViewBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(recyclerViewBinding.root)

        val dataList = mutableListOf<DaelimData>()
        dataList.add(DaelimData(R.drawable.parasite, "기생충", "송강호"))
        dataList.add(DaelimData(R.drawable.sinsegye, "신세계", "황정민 이정재"))
        dataList.add(DaelimData(R.drawable.surinam, "수리남", "황정민 하정우"))
        dataList.add(DaelimData(R.drawable.topgun, "탑건:매버릭", "톰 크루즈"))
        dataList.add(DaelimData(R.drawable.todaytomorrow, "대충 고마츠나나 나오는거", "고마츠 나나"))

        recyclerViewBinding.rcRcView.adapter = RecyclerAdapter(dataList)
        recyclerViewBinding.rcRcView.layoutManager = GridLayoutManager(this, 2)
    }
}