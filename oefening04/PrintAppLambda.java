package oefening04;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> print('#',100));
        Thread thread2 = new Thread(() -> print('*',1000));
        thread.setDaemon(true);
        thread2.setDaemon(true);
        thread.start();
        thread2.start();
    }

    public static void print(char c, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(c);
            Thread.yield();
        }
    }
}