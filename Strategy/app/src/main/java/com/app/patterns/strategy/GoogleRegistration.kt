package com.app.patterns.strategy

// google variation of the registration
class GoogleRegistration : RegistrationStrategy {

    override fun register(user: User) {
        println(user.name + " registered with Google")
    }
}