package hw10;

public class IfMaxArray {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 999 + 100); // 100..999
        System.out.println("Random number => " + num);
        System.out.println();

        example(num);

    }

    public static void example(int n) {
        int first = (int) Math.floor(n/100);
        int second = (int) Math.floor((n - first*100)/10);
        int third = (int) Math.floor(n - first*100 - second*10);
        System.out.println("first => " + first);
        System.out.println("second => " + second);
        System.out.println("third => " + third);

        int[] arr = {first, second, third};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max number of " + n + " is => " + max);


    }

}
