package com.github.javafundamental.calculator;

import java.util.Scanner;

public class Main {
    static double result;
    static int menu;
    static double firstNumber, secondNumber, results;
    static Scanner input = new Scanner(System.in);

    static double multiplication(){
        System.out.print("input first number: ");
        firstNumber = input.nextDouble();
        System.out.print("input second Number: ");
        secondNumber = input.nextDouble();
        result = firstNumber * secondNumber;
        return result;
    }
    static double division(){
        System.out.print("input first number: ");
        firstNumber = input.nextDouble();
        System.out.print("input second Number: ");
        secondNumber = input.nextDouble();
        result = firstNumber / secondNumber;
        return result;
    }
    static  double addition(){
        System.out.print("input first number: ");
        firstNumber = input.nextDouble();
        System.out.print("input second Number: ");
        secondNumber = input.nextDouble();
        result = firstNumber + secondNumber;
        return result;
    }
    static double subtraction(){
        System.out.print("input first number: ");
        firstNumber = input.nextDouble();
        System.out.print("input second Number: ");
        secondNumber = input.nextDouble();
        result = firstNumber - secondNumber;
        return result;
    }
    public static void main(String[] args) {
        boolean alwaysLooping = true;
        while (alwaysLooping) {
            System.out.println("========== MENU ===========");
            System.out.println("1.multiplication");
            System.out.println("2.division");
            System.out.println("3.addition");
            System.out.println("4.subtraction");
            System.out.println("10.exit");
            System.out.print("Choose Menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    results = multiplication();
                    System.out.println(results);
                    break;
                case 2:
                    results = division();
                    System.out.println(results);
                    break;
                case 3:
                    results = addition();
                    System.out.println(results);
                    break;
                case 4:
                    results = subtraction();
                    System.out.println(results);
                    break;
                case 10:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;

            }
        }
    }
}


