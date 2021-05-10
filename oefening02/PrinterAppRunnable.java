package oefening02;

public class PrinterAppRunnable {
    public static void main(String[] args) {
        CharacterPrinter printer = new CharacterPrinter('*',100);
        CharacterPrinter printer2 = new CharacterPrinter('#',100);

        Thread thread = new Thread(printer);
        Thread thread2 = new Thread(printer2);
        thread.start();
        thread2.start();
    }
}
