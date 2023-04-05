package arrays;

import java.util.Arrays;

public class Task1HW {
    public static void main(String[] args) {

        arrCountEven();

    }

    public static void arrCountEven() {

        int[] a = new int[15];
        int countEven = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            if (a[i]%2 == 0) {
                countEven++;
            }
        }
        System.out.println("a => " + Arrays.toString(a));
        System.out.println("countEven => " + countEven);

    }

}

















