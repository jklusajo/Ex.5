package com.example.ex5;

import java.util.Locale;

public class Task5 {
    public static void main(String[] args) {

        String s = "Racecar", revSt = ""; //revSt = reverse string

        int sLength = s.length();

        for(int i = (s.length() - 1); i >= 0; i--){
            revSt += s.charAt(i);
        }

        if(s.toLowerCase().equals(revSt.toLowerCase())){
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }
}