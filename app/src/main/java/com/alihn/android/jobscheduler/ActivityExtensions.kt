package com.alihn.android.jobscheduler

import android.app.Activity
import android.widget.Toast

/**
 * Helper extension function for showing a [Toast]
 */
fun Activity.showToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}