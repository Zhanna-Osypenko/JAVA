package hw9;

import hw7.TempScan;

import java.util.Scanner;

public class KolbaTemperature {
    public static void main(String[] args) {
        int Temperature1;
        int Temperature2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature 1: ");
        int Temp1 = sc.nextInt();

        System.out.println("Enter temperature 2: ");
        int Temp2 = sc.nextInt();

        sc.close();

        KolbaTemperature kt = new KolbaTemperature();
        kt.CheckTemperature(Temp1, Temp2);

    }

    public static void CheckTemperature(int t1, int t2) {

        if (t1 > 100 && t2 < 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
