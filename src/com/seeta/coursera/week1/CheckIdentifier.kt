package com.seeta.coursera.week1

fun isValidIdentifier(s: String): Boolean {
    return s.isNotEmpty() && s.matches("[A-Za-z_][a-zA-Z0-9_]*".toRegex())
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("name__"))  // true
    println(isValidIdentifier("name__Name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}