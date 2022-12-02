package com.daelim.one

import android.media.Image
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class vHolder {
    var image : ImageView ?= null
    var title : TextView ? = null
    var description : TextView ?= null

    fun set(i : ImageView, t : TextView, d : TextView ){
        Log.e("!!!", "셋 메소드 실행")
        image = i
        title = t
        description = d
    }
}