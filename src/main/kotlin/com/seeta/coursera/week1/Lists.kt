package com.seeta.coursera.week1

fun main(args: Array<String>) {
    // collections
    val list = listOf(1, 2, 3, 3, 4, 5)
    println(list.map { s ->
        s + 2
    }.sum())

    println("\n\nList for in example:")
    // iterate over list
    for (i in (1..10).toList()) {
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

    println("\n=========================\n")

    list.filterIndexed { index, _ -> index != 10 }.forEach { println(it) }

    val (first, second) = list.withIndex().partition { it.index == 2 }

    println("\nfirst => ${first.map { it.value }}")
    println("second => ${second.map { it.value }}")

    println("first + second => ${first + second}")


}