
public class PrintCashierB implements Runnable {
    public void Start() {
        for (int i = 1; i <= 10; i++) {
        System.out.println("Cashier B");
            System.out.println("Customer: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        Start();
    }
}
