package com.app.wski.decorator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var waffle: Dessert = Waffle()

        waffle = CreamWaffleDecorator(dessert = waffle)

        waffle = StrawberryWaffleDecorator(dessert = waffle)

        waffle = ChocolateWaffleDecorator(dessert = waffle)

        println(waffle.prepare())
    }
}
