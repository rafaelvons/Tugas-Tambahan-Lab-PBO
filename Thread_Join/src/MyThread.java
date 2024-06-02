class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " is running.");
        try {
            // Simulate some work with sleep
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " has finished.");
    }
}
