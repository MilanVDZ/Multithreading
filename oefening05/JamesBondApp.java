package oefening05;

import java.util.Random;

public class JamesBondApp {
    public static void main(String[] args) {
        try {
            Random rand = new Random();
            TimeBomb bomb = new TimeBomb(10);
            bomb.activate();
            int time = rand.nextInt(30000);
            Thread.sleep(time);
            bomb.disarm();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
