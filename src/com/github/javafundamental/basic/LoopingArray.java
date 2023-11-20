package com.github.javafundamental.basic;

public class LoopingArray {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i = 0; i<myArray.length; i++){
            System.out.println("index: "+ i + " value: "+ myArray[i]);
        }
    }
}
