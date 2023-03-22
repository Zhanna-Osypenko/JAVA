package hw7;

import java.util.Scanner;

public class ChangeInteger {
    public static void main(String[] args) {
        // Напишите программу на Java для того, чтобы поменять местами значения,
        // хранящиеся в двух переменных с помощью третьей переменной
//        int a = 10;
//        int b = 20;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        ChangeInteger changeInteger = new ChangeInteger();
        changeInteger.rotate(a,b);

        sc.close();
    }
    public void rotate(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Change operation:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
