package com.seeta.coursera.week2

fun String?.isEmptyOrNull(): Boolean = this == null || this.isEmpty()

fun String.sliding(size: Int): List<String> {
    var list = listOf<String>()
    if (size <= 0 || size > length) {
        list = listOf()
    } else {
        for((index, _) in this.withIndex()) {
            val endIndex = if (index + size < length) index + size else length
            val substring = substring(index, endIndex)
            if (size == substring.length) {
                list = list + substring
            }
        }
    }
    return list
}

fun main(args: Array<String>) {
    val input = "abcdefghijklmnopqrstuvwxyz"
    println(input.sliding(0))
    println(input.sliding(1))
    println(input.sliding(2))
    println(input.sliding(3))
    println(input.sliding(4))
    println(input.sliding(5))
    println(input.sliding(input.length))


    val s1: String? = null
    val s2: String? = ""
    println(s1.isEmptyOrNull()) //eq true
    println(s2.isEmptyOrNull()) //eq true

    val s3 = "   "
    println(s3.isEmptyOrNull()) //eq false

    println(s1 as? Int)
    println(s1 as Int?)

}
