package com.pragra.day6;

import java.util.Scanner;

public class LoopSc {
    public static void main(String[] args) {
        int thoughtNo = (int) (Math.random() * 100);
        System.out.println("Let's play guessing game");
        System.out.println("I have thought a number from 0-99 . . You try guessing it . .0");

        Scanner sc = new Scanner(System.in);
        int guessedNo = sc.nextInt();

        while (thoughtNo != guessedNo) {
            System.out.println("Your guess was wrong . . Try again");
            if (guessedNo > thoughtNo) {

                System.out.println("Come down lil bit");
            } else {
                System.out.println("Go up");
            }

            guessedNo = sc.nextInt();
        }


        System.out.println("You win : Guessed right");
    }

}
