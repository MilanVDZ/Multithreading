package oefening06;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> print('#',100));
        Thread thread2 = new Thread(() -> print('*',100));
        thread.start();
        thread2.start();

        try{
            thread.join();
            thread2.join();
        } catch (InterruptedException e){
        }
        System.out.println("End");
    }

    public static void print(char c, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(c);
            try{
                Thread.sleep(190);
            } catch (InterruptedException ex){

            }
        }
    }
}
