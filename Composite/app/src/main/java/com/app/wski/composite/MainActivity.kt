package com.app.wski.composite

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = Manager(name = "Mark")

        manager.addWorker(AndroidDeveloper(name = "Annushka"))
        manager.addWorker(AndroidDeveloper(name = "John"))
        manager.addWorker(IOSDeveloper(name = "Ivan"))

        val mainManager = Manager(name = "MainManager")
        mainManager.addWorker(IOSDeveloper(name = "Alinushka"))
        mainManager.addWorker(manager)

        mainManager.processTask("Add new functionality: ")
    }
}
