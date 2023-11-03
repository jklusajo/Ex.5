package com.example.ex5;

public class Task1 {
    public static void main(String[] args) {

        int num[] = new int[10];
        for(int i = 0; i < num.length; i++){
            num[i] = num.length - i - 1;
        }
        for (int a: num){
            System.out.print("array[" + a + "] = " + num[a]);
        }
    }
}