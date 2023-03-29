import java.util.Scanner;

public class hwCountryPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter please town: ");
        String town = sc.next();
        System.out.println();
        System.out.println("Enter please COUNTRY: 1 - Germany/2 - France: ");
        int countryAbbr = sc.nextInt();

        System.out.println("Enter please POPULATION: ");
        int populationValue = sc.nextInt();
        System.out.println();

        sc.close();
        System.out.println("countryAbbr => " + countryAbbr);
        System.out.println("populationValue => " + populationValue);

        getCitySize(countryAbbr,populationValue);
    }

    public static void getCitySize(int country, int population) {
        if (country != 1 && country != 2) {
            System.out.println("wrong country");
        }

        if (country == 1) {
            System.out.println("if GERMANY");
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
        if (country == 2) {
            System.out.println("if France");
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