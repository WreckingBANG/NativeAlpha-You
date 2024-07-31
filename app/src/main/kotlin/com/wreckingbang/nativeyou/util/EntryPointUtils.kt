package com.wreckingbang.nativeyou.util

import android.app.Activity
import com.wreckingbang.nativeyou.model.DataManager
import android.content.Intent
import com.wreckingbang.nativeyou.BuildConfig
import com.wreckingbang.nativeyou.activities.NewsActivity

object EntryPointUtils {
    @JvmStatic
    fun entryPointReached(a: Activity) {
        if (kotlin.math.abs(DataManager.getInstance().lastShownUpdate - BuildConfig.VERSION_CODE) > 10 ) {
            a.startActivity(Intent(a, NewsActivity::class.java))
        }
        DataManager.getInstance().loadAppData()
    }
}