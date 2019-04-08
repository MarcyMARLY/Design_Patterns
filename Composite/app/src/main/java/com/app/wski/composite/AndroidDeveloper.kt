package com.app.wski.composite

import android.util.Log

class AndroidDeveloper(
    val name: String
) : Worker {

    override fun processTask(task: String) {
        //..//
        Log.d("Processing task", name + " started the task")
    }
}