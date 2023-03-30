import java.util.Scanner;

public class hwCountryPopulation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter please town: ");
        String town = sc.next();
        System.out.println();
        System.out.println("Enter please COUNTRY: g - Germany/f - France: ");
        String countryAbbr = sc.next();

        System.out.println("Enter please POPULATION: ");
        int populationValue = sc.nextInt();
        System.out.println();

        sc.close();

        getCitySize(countryAbbr,populationValue);
    }

    public static void getCitySize(String country, int population) {
        if (!country.equals("g") && !country.equals("f")) {
            System.out.println("wrong country");
        }

        if (country.equals("g")) {
            if (population > 0 && population <= 100000) {
                System.out.println("Small city");
            } else if (population > 100000 && population <= 400000) {
                System.out.println("middle city");
            } else if (population > 400000 && population <= 1000000) {
                System.out.println("unknown size from 400k to 1kk");
            } else if (population > 1000000) {
                System.out.println("Big city");
            } else System.out.println("wrong population value");
        }
        if (country.equals("f")) {
            if (population > 0 && population <= 200000) {
                System.out.println("Small city");
            } else if (population > 200000 && population <= 500000) {
                System.out.println("middle city");
            } else if (population > 500000 && population <= 1500000) {
                System.out.println("unknown size from 500k to 1,5kk");
            } else if (population > 1000000) {
                System.out.println("Big city");
            } else System.out.println("wrong population value");
        }

    }

}