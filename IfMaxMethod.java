package hw10;

public class IfMaxMethod {
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

        int max = first;

        if (max < second) {
            max = second;
        } else if (max < third) {
            max = third;
        }

        System.out.println("max number of " + n + " is " + max);


    }

}
