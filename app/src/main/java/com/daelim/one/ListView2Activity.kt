package com.daelim.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daelim.one.databinding.ActivityListView2Binding

class ListView2Activity : AppCompatActivity() {
    private val lv2Binding by lazy{
        ActivityListView2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(lv2Binding.root)

        var list = mutableListOf<DaelimData>()
        list.add(DaelimData(R.drawable.parasite, "기생충", "송강호 주연"))
        list.add(DaelimData(R.drawable.surinam, "수리남", "황정민 하정우 주연"))
        list.add(DaelimData(R.drawable.sinsegye, "신세계", "황정민 이정재 주연"))
        list.add(DaelimData(R.drawable.topgun, "탑건 : 매버릭", "톰 크루즈 주연"))
        list.add(DaelimData(R.drawable.todaytomorrow, "나는 오늘 어제의 너와 만난다", "고마츠 나나 주연"))

        lv2Binding.lvList2.adapter = DaelimAdapter(list)

    }
}