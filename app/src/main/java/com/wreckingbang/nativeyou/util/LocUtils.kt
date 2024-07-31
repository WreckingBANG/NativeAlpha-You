package com.wreckingbang.nativeyou.util

import java.util.*

object LocUtils {
    val fileEnding: String
        get() = when (Locale.getDefault().language) {
            "de" -> "de"
            else -> "en"
        }
}