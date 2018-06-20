package com.fefe.mystationalyaac.utils

import android.view.View
import android.widget.TextView

inline var View.isVisible: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }