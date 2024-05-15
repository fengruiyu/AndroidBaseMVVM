package com.fry.base.utils

import androidx.annotation.StringRes
import com.fry.base.BaseApplication.Companion.application as app

fun getString(@StringRes stringRes: Int): String {
    return app.getString(stringRes)
}