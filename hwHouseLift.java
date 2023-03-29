import java.util.Scanner;

public class hwHouseLift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter please value of floors in your house : ");
        int houseFloorsValue = sc.nextInt();

        System.out.println("Enter please value of lift up N: ");
        int liftUp = sc.nextInt();

        System.out.println("Enter please value of lift down M: ");
        int liftDown = sc.nextInt();

        System.out.println("H = " + houseFloorsValue + ", N = " + liftUp + ", M = " + liftDown);

        getLift(houseFloorsValue,liftUp,liftDown);
        sc.close();
    }

    public static int getLift(int h, int n, int m) {
        if (h <= 1 || n <= m || n <= 1 || m < 0) {
            System.out.println("wrong value H, N or M");
            return 0;
        }

        int count = 1;
        for (int i = 1; i <= h; i += (n - m)) {
//            System.out.println("i = " + i);
            if (h <= (i + n)) {
                System.out.println("value of lift UP => " + count);
                return count;
            }
            count++;

        }
        System.out.println("value of lift UP => " + count);
        return count;
    }

}