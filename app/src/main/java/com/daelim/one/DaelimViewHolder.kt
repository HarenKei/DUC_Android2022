package com.daelim.one

import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class DaelimViewHolder {
    var image : ImageView ?= null
    var name : TextView ?= null
    var desc : TextView ?= null

    fun set(i : ImageView, t : TextView, d : TextView ){
        Log.e("!!!", "셋 메소드 실행")
        image = i
        name = t
        desc = d
    }
}