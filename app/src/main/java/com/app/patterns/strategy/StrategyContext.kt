package com.app.patterns.strategy

class StrategyContext {

    private var strategy: RegistrationStrategy? = null

    fun setStrategy(strategy: RegistrationStrategy) {
        this.strategy = strategy
    }

    fun executeStrategy(user: User) {
        strategy?.register(user)
    }
}