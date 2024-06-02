public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Menunggu hingga thread1 selesai
            thread1.join();
            System.out.println("Thread 1 telah selesai. Sekarang menunggu Thread 2.");

            // Menunggu hingga thread2 selesai
            thread2.join();
            System.out.println("Thread 2 telah selesai. Sekarang menunggu Thread 3.");

            // Menunggu hingga thread3 selesai
            thread3.join();
            System.out.println("Thread 3 telah selesai. Semua thread telah selesai.");
        } catch (InterruptedException e) {
            System.out.println("Thread utama terganggu.");
        }

        System.out.println("Thread utama telah selesai.");
    }
}