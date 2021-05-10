package oefening07;

public class CounterAppLambda {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread thread = new Thread(() -> increment(counter,10000));
        Thread thread2 = new Thread(() -> increment(counter,10000));

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(counter.getCount());
    }

    public static void increment(Counter counter, int number){
        for (int i = 0; i < number; i++) {
            counter.increment();
        }
    }
}