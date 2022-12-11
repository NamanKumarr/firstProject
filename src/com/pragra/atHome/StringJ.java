package com.pragra.atHome;

public class StringJ {

    //Given a string and a non-negative int n, we'll say that the front of the string is the
    // first 3 chars, or whatever is there if the string is less than length 3.
    // Return n copies of the front;
    //frontTimes("Chocolate", 2) → "ChoCho"
    //frontTimes("Chocolate", 3) → "ChoChoCho"
    //frontTimes("Abc", 3) → "AbcAbcAbc
    public static void main(String[] args) {
        String st = "Choclate";
        int n ;
        st.length() ;

        for( n=0; n<5; n++){
            System.out.print(st.substring(0,3));
        }

    }
}
