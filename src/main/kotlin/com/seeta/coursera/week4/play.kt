package com.seeta.coursera.week4

import java.math.BigInteger

class Rational(val numerator: BigInteger, val denominator: BigInteger) {
  init {
    if (denominator == BigInteger.ZERO) throw IllegalArgumentException("$denominator should not be zero")
  }

  //TODO rational equals



  //TODO: what to return normalized or original?
  override fun toString(): String {
    val normalized = normalize(this) //Why i have to calculate every time? access specifier

    return if (normalized.numerator == BigInteger.ZERO || normalized.denominator == BigInteger.ONE) {
      normalized.numerator.toString()
    } else {
      "(${normalized.numerator}/${normalized.denominator})"
    }
  }

  //TODO I do not know check it
  override fun equals(other: Any?): Boolean {
    return when(other) {
      is Rational -> {
        val left = normalize(this)
        val right = normalize(other)
        left.numerator == right.numerator && left.denominator == right.denominator
      }
      else -> false
    }
  }

  private fun normalize(given: Rational): Rational {
    val gcd = given.numerator.gcd(given.denominator)
    return Rational(given.numerator / gcd, given.denominator / gcd)
  }

  override fun hashCode(): Int {
    val normalized = normalize(this)
    return 31 * normalized.numerator.hashCode() + normalized.denominator.hashCode()
  }
}

infix fun Int.divBy(denominator: Int): Rational = Rational(this.toBigInteger(), denominator.toBigInteger())
infix fun Long.divBy(denominator: Long): Rational = Rational(this.toBigInteger(), denominator.toBigInteger())
infix fun BigInteger.divBy(denominator: BigInteger): Rational = Rational(this, denominator)


operator fun Rational.plus(another: Rational): Rational = Rational(numerator * another.denominator + denominator * another.numerator, denominator * another.denominator)

operator fun Rational.minus(another: Rational): Rational = Rational(numerator * another.denominator - denominator * another.numerator, denominator * another.denominator)

fun main(args: Array<String>) {
  val a = 1 divBy 2
  val b = 2 divBy 4

  (1..10)
  println("23/1/2019".split("/"))
  println(a)
  println(b)

  println(b == a)
  println(a + b)
  println(a - b)
  println(a - b)

  1 divBy 0


}