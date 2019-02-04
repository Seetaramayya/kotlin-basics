package com.seeta.coursera.week1;

public class Example {
    public static void main(String[] args) {
        //Calling kotlin code from Java
        Tutorail.main(args);

        for (char i : "abc".toCharArray()) {
            System.out.println(i + 1);
            System.out.println((char)(i + 1));
        }

        for (char c = '0'; c < '9'; c++) {
            System.out.print(c);
        }

    }
}
