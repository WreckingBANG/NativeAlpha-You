package com.wreckingbang.nativeyou.util

import java.util.*


object LocaleUtils {
    @JvmStatic
    val fileEnding: String
        get() = when (Locale.getDefault().language) {
            "de" -> "de"
            else -> "en"
        }
}

