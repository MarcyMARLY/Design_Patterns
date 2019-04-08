package com.app.wski.decorator

class ChocolateWaffleDecorator(
    dessert: Dessert
) : WaffleDecorator(dessert) {

    override fun prepare(): String = super.prepare() + " and chocolate"
}