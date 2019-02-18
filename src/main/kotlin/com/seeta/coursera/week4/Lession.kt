package com.seeta.coursera.week4

fun main(args: Array<String>) {

    println(Rectangle(10, 10).isSquare)

    println(StateLogger().state)
    StateLogger().state = true
    println(StateLogger().state)

    val user = SubscribingUser()
    println(user.nickname)
    println(user.nickname)

    println("abc".lastIndex) // 2
    println("abc".indices) // 0..2

}


class StateLogger {
    var state = false
        set(value) {
            println("state is changed $field -> $value")
            field = value
        }
}

class Rectangle(val height: Int, val width: Int) {
    // What is the need of get() here why can not be just val
    // STRANGE THIS IS `val with get` calculates every time
    val isSquare: Boolean
        get() {
            return height == width
        }
}

interface User {
    val nickname: String
}

class FacebookUser : User {
    override val nickname = "some user1"
}

class SubscribingUser : User {
    override val nickname: String
        get() {
            println("each time calculates")
            return "some user2"
        }
}

val String.lastIndex: Int
    get() = this.length - 1
val String.indices: IntRange
    get() = 0..lastIndex


