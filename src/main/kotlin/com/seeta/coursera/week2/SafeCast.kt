package com.seeta.coursera.week2

import com.seeta.coursera.week2.Gender.FEMALE
import com.seeta.coursera.week2.Gender.MALE

enum class Gender {
    MALE, FEMALE
}
data class Hero(val name: String, val age: Int, val gender: Gender?)

fun main(args: Array<String>) {
    val heroes = listOf(
            Hero("The Captain", 60, MALE),
            Hero("Frenchy", 42, MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, FEMALE),
            Hero("First Mate", 29, MALE),
            Hero("Sir Stephen", 37, MALE))

    val (first, second) = heroes
            .flatMap { heroes.map { hero -> it to hero } }
            .maxBy { it.first.age - it.second.age }!!
    println(first.name)
}