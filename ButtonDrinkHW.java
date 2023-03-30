import java.util.Scanner;

public class ButtonDrinkHW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("choose a drink: 1 - espresso | 2 - americano | 3 - cappuccino | 4 - water ");
        int valueDrink = sc.nextInt();

        System.out.println();

        getDrinkIf2(valueDrink);
        System.out.println();
        getDrinkSwitch(valueDrink);


        sc.close();
        System.out.println();
    }


    public static String getDrinkIf2(int n) {
        String nameDrink;
        if (n == 1) {
            nameDrink = "espresso";
        } else if (n == 2) {
            nameDrink = "americano";
        } else if (n == 3) {
            nameDrink = "cappuccino";
        } else if (n == 4) {
            nameDrink = "water";
        } else {
            nameDrink = "WRONG VALUE";
            System.out.println(nameDrink);
            return nameDrink;
        }
        System.out.println("IF2 method. Your " + nameDrink + " get ready");
        return nameDrink;
    }

    public static void getDrinkSwitch(int n) {
        String nameDrink;
        switch (n) {
            case 1:
                nameDrink = "espresso";
                break;
            case 2:
                nameDrink = "americano";
                break;
            case 3:
                nameDrink = "cappuccino";
                break;
            case 4:
                nameDrink = "water";
                break;

            default:
                nameDrink = "WRONG VALUE";
                System.out.println(nameDrink);
                return;
        }
        System.out.println("Switch method. Your " + nameDrink + " get ready");
    }

}