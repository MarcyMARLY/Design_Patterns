package com.app.wski.decorator

class CreamWaffleDecorator(
    dessert: Dessert
) : WaffleDecorator(dessert) {

    override fun prepare(): String = super.prepare() + " and cream"
}