public class Main extends Thread {
    public static void main(String[] args) {


            PrintCashierA kasirA = new PrintCashierA();
            PrintCashierB kasirB = new PrintCashierB();
            
            Thread threadA = new Thread(kasirA);
            Thread threadB = new Thread(kasirB);

            threadA.start();
            threadB.start();
        }
}