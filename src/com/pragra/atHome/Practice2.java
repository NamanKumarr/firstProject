package com.pragra.atHome;

public class Practice2 {
    public static void main(String[] args) {
        TestEvenOrOdd(
                0
        );
    }

    public static void TestEvenOrOdd(int x) {
        if (x == 0) {
            System.out.println("Nuteral");
        } else if ((x % 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
