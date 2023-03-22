package hw7;

public class TempConverterRun {
    public static void main(String[] args) {
        TempConverterCKF tempConverterCKF = new TempConverterCKF();
        TempScan is = new TempScan();

        double tempCelsium = is.tempScan("Enter Celsium temperature please: ");
        double tempKelvin = tempConverterCKF.convertCelsiumToKelvin(tempCelsium);
        double tempFehr = tempConverterCKF.convertCelsiumToFehrengeit(tempCelsium);

        System.out.println((int)tempCelsium + "C to Kelvin => " + tempKelvin);
        System.out.println((int)tempCelsium + "C to Fehrengeit => " + tempFehr);

    }
}
