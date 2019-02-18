@file: JvmName("Extensions")
package com.seeta.coursera.week2

@JvmOverloads
fun <A> List<A>.mkString(prefix: String = "", delimiter: String = "", postfix: String = "") = joinToString(prefix, delimiter, postfix)

// TODO: How to generalize? unit, semigroup??
fun List<Int>.sum() = foldRight(0) { elem, total ->  elem + total}

fun <A,B> List<Pair<A, B>>.toPair(): Pair<List<A>, List<B>> {
    fun <A,B> listToPair(list: List<Pair<A, B>>, acc: Pair<List<A>, List<B>>): Pair<List<A>, List<B>> {
        return if (list.isEmpty()) acc
        else {
            val (first, second) = list.first()
            listToPair(list.tail(), Pair(acc.first + first, acc.second + second))
        }
    }
    return listToPair(this, Pair(listOf(), listOf()))
}

fun <T> List<T>.tail() = drop(1)