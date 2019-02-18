package com.seeta.coursera.week3

import java.util.*

val foo: Int
    get() = Random().nextInt()

fun main(args: Array<String>) {
    // I agree NullPointer Exception should be avoided, but it is too late for them
    // (it should be handled at compile time not runtime)



    val string1: String = "Hello" // null can not be assigned
    val string2: String? = null // null can not be assigned

    // Elvis Operator
    val length = string2?.length ?: 0

    println("should be 0 => $length")

    val a: Int? = null
    val b: Int? = 1
    val c = 2

    val s1 = (a ?: 0) + c
    val s2 = (b ?: 0) + c

    println("$s1$s2")


    // The values should be different:
    println(foo)
    println(foo)
    println(foo)

    // Not null assertion throws if left is null otherwise returns the value
    println(string1!!.length)
    string2!!.length

}


