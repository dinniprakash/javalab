class MyThread extends Thread {

    public MyThread() {
        // default constructor
    }

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Threading {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();

        System.out.println("Main thread is running...");
    }
}
