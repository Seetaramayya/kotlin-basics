package com.seeta.coursera.week2;

import kotlin.collections.CollectionsKt;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ListExtensionsKtTest {
    List<Integer> list = CollectionsKt.listOf(1, 2, 3);
    @Test
    public void mkString() {
        assertThat(Extensions.mkString(list), is("123"));
    }

    @Test
    public void sum() {
        assertThat(Extensions.sum(list), is(6));
    }
}
