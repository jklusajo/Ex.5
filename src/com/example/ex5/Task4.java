package com.example.ex5;

public class Task4 {
    public static void main(String[] args) {

        String s1 = "Play";
        String s2 = "Game";
        String s3 = s1 + s2;
        String s4 = s2 + s1;

        System.out.println("String 3 says: " + s3);
        System.out.println("String 4 says: " + s4);

        System.out.println();

        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s3));
    }
}