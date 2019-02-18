package com.seeta.coursera.week2

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { it.first == it.second }

    val commonLetters = "ABCDEF".sumBy { ch ->

        val min = Math.min(secret.count { it == ch }, guess.count { it == ch })
        println("[$ch] ${secret.count { it == ch }} ${guess.count { it == ch}} '$min'")
        min
    }
    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main(args: Array<String>) {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)
    println(evaluateGuess("BCDF", "ACEB")) // eq result
    println(evaluateGuess("AAAF", "ABCA")) // eq result
    println(evaluateGuess("ABCA", "AAAF")) // eq result
}