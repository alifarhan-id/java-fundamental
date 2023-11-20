package com.github.javafundamental.basic;

public class NestedFor {
    public static void main(String[] args) {
        // create spruce
        int tinggi = 10;
        for(int i = 0; i <= tinggi; i++){
            for(int j = 0; j <= tinggi - i; j++){
                System.out.print(" ");
            }
            for(int s = 2; s < 2 * i + 1; s++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
