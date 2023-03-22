package hw7;

import java.util.Scanner;

public class TempScan {
    public double tempScan(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        double input = scanner.nextDouble();
        return input;
    }
}
