// From java class all these functions can be called with either `file_name.function` name or
// This `JvmName.function`.

@file: JvmName("Tutorail")
package com.seeta.coursera.week1

fun main(args: Array<String>) {
    val name = if (args.isEmpty()) "World" else args[0]
    println("Hello $name!")

    // collections
    val list = listOf(1, 2, 3, 4, 5)
    println(list.map { s ->
        s + 2
    }.sum())

    println("\n\nList for in example:")
    // iterate over list
    for (i in list) {
        print(i)
    }

    println("\n\nList foreach example:")
    list.forEach { i ->
        print(i)
    }


    print("\n\nList with index example: ")
    for ((index, element) in list.withIndex()) {
        print("($index -> $element) ")
    }

    print("\n\nRange example: ")
    (1..9).forEach {
        i -> print(i)
    }

    print("\n\nRange with step and downTo example: ")
    (9 downTo 1 step 2).forEach {
        i -> print(i)
    }

    print("\n\nRange with step example: ")
    (1..9 step 2).forEach {
        i -> print(i)
    }

    println("\n\nCharacter + 1 is resulting Character not ascii number")
    for (ch in "abc") {
        print(ch + 1)
    }

    print("\n\nUntil example: ")
    (1 until 9).forEach {
        i -> print(i)
    }

    print("\n\nMap example: ")
    // iterate over map
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key, value) in map) {
        print("($key, $value) ")
    }

}