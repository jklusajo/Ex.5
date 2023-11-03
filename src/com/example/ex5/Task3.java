package com.example.ex5;

public class Task3 {
    public static void main(String[] args) {

        int a, b, sum = 0;
        int tb[][] = new int[10][10];

        for(a = 0; a < 10; a++){
            for(b = 0; b < 10; b++){
                if(a == b){
                    tb[a][b] = a;
                    sum += tb[a][b];
                }
                System.out.print(tb[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the numbers diagonally arranged in a 10 by 10 matrix is: " + sum);
    }
}