package com.seeta.coursera.week1

import org.junit.Test

import org.junit.Assert.*
import org.hamcrest.core.Is.`is`

class ListExtensionsKtKtTest {
    private val list = listOf(1, 2, 3)

    @Test
    fun mkString() {
        assertEquals(list.mkString(), "123")
    }

    @Test
    fun sum() {
        assertThat(list.sum(), `is`(6))
    }
}