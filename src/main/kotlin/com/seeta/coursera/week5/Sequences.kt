package com.seeta.coursera.week5

import com.seeta.coursera.week3.show
import java.util.Random
import kotlin.coroutines.experimental.buildSequence

fun fibonacci(): Sequence<Int> = buildSequence {
    var pair = Pair(0, 1)
    while (true) {
        yield(pair.first)
        pair = Pair(pair.second, pair.first + pair.second)
    }
}

class Words {
    private val list = mutableListOf<String>()

    fun String.record() {
        list += this
    }

    override fun toString() = list.toString()

    operator fun String.unaryPlus() {
        record()
    }
}

fun main(args: Array<String>) {
    println("started")
    (1..15).toList().toString().show()
    val seq = generateSequence(0) {
        (it + 1)
    }
    println(seq.take(20).toList())

    val numbers = generateSequence(3) { n ->
        println("Generating element...")
        (n + 1).takeIf { it < 7 }
    }
    println(numbers.drop(1).first())


    println(fibonacci().take(4).toList().toString())

    println(fibonacci().take(10).toList().toString())

    val words = Words()
    with(words) {
        // The following two lines should compile:
        "one".record()
        + "two"
    }
    words.toString().show() // "[one, two]"
}