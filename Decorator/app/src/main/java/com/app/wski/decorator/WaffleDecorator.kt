package com.app.wski.decorator


abstract class WaffleDecorator(
    private val dessert: Dessert
) : Dessert {

    override fun prepare(): String = dessert.prepare()
}