package com.example.ex5;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int min = 100, max = 0;
        Random rd = new Random();
        int arr[] = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(rd.nextInt(100) + 1);
            System.out.print(arr[i] + " , ");

            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println();
        System.out.println("The smallest number in the array is: " + min);
        System.out.println("The largest number in the array is: " + max);
    }
}