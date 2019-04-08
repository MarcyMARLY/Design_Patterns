package com.app.wski.composite

import android.util.Log

class Manager(
    val name: String
) : Worker {

    private val workers: MutableList<Worker> = mutableListOf()

    fun addWorker(worker: Worker) {
        workers.add(worker)
    }

    override fun processTask(task: String) {

        Log.d("Processing task", task + name)

        workers.forEach {
            it.processTask(task)
        }
    }
}