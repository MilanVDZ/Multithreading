package oefening05;

public class PrintAppLambda {
    public static void main(String[] args) throws InterruptedException {
            Thread thread = new Thread(() -> print('#', 100));
            Thread thread2 = new Thread(() -> print('*', 1000));
            thread.setName("T1");
            thread2.setName("T2");
            thread.start();
            thread2.start();

            Thread.sleep(470);
            thread.interrupt();
            Thread.sleep(130);
            thread2.interrupt();
        }

    public static void print(char c, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(c);
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex){
                System.out.println(Thread.currentThread().getName() + " :Interrupted");
            }
        }
    }
}