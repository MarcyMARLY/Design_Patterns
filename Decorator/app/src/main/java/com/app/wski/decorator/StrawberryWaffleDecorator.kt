package com.app.wski.decorator

import android.util.Log

class StrawberryWaffleDecorator(
    dessert: Dessert
) : WaffleDecorator(dessert) {

    override fun prepare() = super.prepare() + " and strawberry"
}