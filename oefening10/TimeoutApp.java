package oefening10;

import java.util.Timer;

public class TimeoutApp   {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Timeout timeout = new Timeout(60);
        timer.scheduleAtFixedRate(timeout,1000,1000);
        try{
            Thread.sleep(10000);
        } catch (InterruptedException ie){
        }
        timer.cancel();
    }
}
