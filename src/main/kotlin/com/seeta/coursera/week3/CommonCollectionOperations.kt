package com.seeta.coursera.week3

// Kotlin library: extension on collections
// filter, map, reduce, count, find, flatMap, groupBy, any, all, none, max etc..
fun main(args: Array<String>) {
    // filter
    (1..10).filter { it % 2 == 0 }.joinToString(", ", "(", ")").show()

    // map
    (1..10).map { it * 2 }.joinToString(", ", "(", ")").show()

    // any (all, none)
    (1..10).any { it % 2 == 0}.show("Is there ever number?") // at least one even number
    (1..10).none { it % 2 == 0}.show("No even numbers exists in input") // no even numbers
    (1..10).all { it % 2 == 0}.show("All are even numbers?") // all are even numbers

    // find (firstOrNull and first does the same thing). `first` throws exception if predicate not satisfied
    (1..10).find { it == 11 }.show("find 11 in list")
    (1..10).find { it == 10 }.show("find 10 in list")

    // count
    (1..10).count { it % 2 == 0 }.show("Number of even numbers are ")

    // Partition (fiter and filterNot)
    (1..10).partition { it % 2 == 0 }.show()

    // groupBy (stupid example here but group by is like remaining languages no diff)
    // associateBy does the same thing but if there are multiple elements overrides value with last element
    (1..10).groupBy { it % 2 == 0 }.map { it.value }.show()

    // Zip
    (65..90).map { it.toChar() }.zip(1..100).show()
    (97..122).map { it.toChar() }.zip(1..100).show()



}

fun <A> A.show(output: String? = null) = if (output == null) println(this) else println("$output => $this")