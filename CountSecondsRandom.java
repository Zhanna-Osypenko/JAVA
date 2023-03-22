package hw8;

import java.util.Scanner;

public class CountSecondsRandom {
    public static void main(String[] args) {

        int ts = (int) (Math.random() * 28880); // 0..28 880;
        System.out.println("Now time is " + ts + " seconds");

        CountSecondsRandom countSeconds = new CountSecondsRandom();
        countSeconds.TimeConverter(ts);

    }

    public void TimeConverter(int time) {
        int timeHour = 8 - (time / 3600);
        System.out.println("Finish time is " + timeHour + " hour" );
    }
}
