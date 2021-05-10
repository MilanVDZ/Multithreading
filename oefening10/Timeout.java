package oefening10;

import java.util.*;

public class Timeout extends TimerTask {
    private int seconde;

    public Timeout(int seconde) {
        this.seconde = seconde;
    }

    public void run() {
        seconde++;
        System.out.println(seconde);
    }
}
