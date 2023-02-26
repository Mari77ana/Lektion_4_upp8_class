package com.example.lektion_4_upp8_class

class User( val name: String, val age: Int, var rememberMe: Boolean) {


    override fun toString(): String {
        return "User(name='$name', age=$age, isLate=$rememberMe)"
    }
}