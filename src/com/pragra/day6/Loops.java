package com.pragra.day6;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("Hello ");
            }
            {
                System.out.println();
            }
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            {
                System.out.println();
            }

        }
    }

}