package com.auto.hw;

import java.util.Scanner;

public class PizzaSquareScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle diametr: ");
        //int intN = sc.nextInt();
        double a = sc.nextInt();

        PizzaSquareCalculation pizzaSquareCalculation = new PizzaSquareCalculation(a);

        sc.close();
    }
}
