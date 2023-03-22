package hw7;

public class TempConverterCKF {
    public double convertCelsiumToKelvin(double tempCelsium) {
        double tempInKelvin = tempCelsium + 273.15;
        return tempInKelvin;
    }

    public double convertCelsiumToFehrengeit(double tempCelsium) {
        double tempInFehrengeit = (1.8 * tempCelsium) + 32;
        return tempInFehrengeit;
    }
}
