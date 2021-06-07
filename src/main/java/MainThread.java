public class MainThread {
    public static void main(String[] args) {

        Numbers printNumber = new Numbers();
        Character printChar = new Character();

        Thread printCharThread = new Thread(printChar);

        printCharThread.start();
        printNumber.start();
    }
}