package com.app.patterns.strategy

//facebook variation of the registration
class FacebookRegistration : RegistrationStrategy{

    override fun register(user: User) {
        println(user.name + " registered with Facebook")
    }
}