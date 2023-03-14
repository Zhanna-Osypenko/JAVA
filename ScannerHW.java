import java.util.Scanner;

public class ScannerHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer from 10 to 26: ");
        int intN = sc.nextInt();

        int intN1 = intN/3;
        int intN1_ = intN%3;

        int intN2 = intN1/3;
        int intN2_ = intN1%3;

        int intN3 = intN2/3;
        int intN3_ = intN2%3;

        System.out.println("Integer " + intN + " in triangle system: " + intN3_ + " " + intN2_ + " " + intN1_);

        sc.close();
    }
}
