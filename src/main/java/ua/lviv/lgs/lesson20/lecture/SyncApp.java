package ua.lviv.lgs.lesson20.lecture;

public class SyncApp {
    static int number = 0;

    public static void main(String[] args) {
        Thread myThread = new Thread(new Worker());
        myThread.start();

        Thread myThread2 = new Thread(new Worker());
        myThread2.start();
        Thread myThread3 = new Thread(new Worker());
        myThread3.start();
        Thread myThread4 = new Thread(new Worker());
        myThread4.start();
        Thread myThread5 = new Thread(new Worker());
        myThread5.start();
        Thread myThread6 = new Thread(new Worker());
        myThread6.start();
        Thread myThread7 = new Thread(new Worker());
        myThread7.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number);

    }

    static synchronized void increment() {
        number++;
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            SyncApp.increment();
        }
    }
}
