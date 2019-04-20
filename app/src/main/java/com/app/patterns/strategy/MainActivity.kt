package com.app.patterns.strategy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("Alice")

        val context = StrategyContext()

        var strategy: RegistrationStrategy = GoogleRegistration()
        context.setStrategy(strategy)
        context.executeStrategy(user)
        //Alice registered with Google

        strategy = FacebookRegistration()
        context.setStrategy(strategy)
        context.executeStrategy(user)
        //Alice registered with Facebook
    }
}
