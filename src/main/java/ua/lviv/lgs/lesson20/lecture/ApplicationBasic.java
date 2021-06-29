package ua.lviv.lgs.lesson20.lecture;

public class ApplicationBasic {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("MyThread", 500);
        myThread.start();

        MyRunnable myRunnable = new MyRunnable("MyRunnable", 500);

    }

}

class MyRunnable implements Runnable {
    //---------------------------------------------------
//   цей варіант конструктора працює якщо ми в методі будемо робити наступний код:
//        MyRunnable myRunnable = new MyRunnable("MyRunnable", 500);
//        Thread t= new Thread(myRunnable);
//        t.start();
//----------------------------------------------------
//    private String name;
//    private int delay;
//
//    public MyRunnable(String name, int delay) {
//        this.name = name;
//        this.delay = delay;
//    }
//-----------------------------------------------------
// наступний спрацює без створення Thread в методі
    private String name;
    private int delay;
    private Thread thread;

    public MyRunnable(String name, int delay) {
        this.name = name;
        this.delay = delay;
        this.thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Name = " + name + ",iteration = " + i + ".");
            if (i == 19) {
                System.out.println("Thread: " + name + " is done.");
            }
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    private String name;
    private int delay;

    public MyThread(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Name = " + name + ",iteration = " + i + ".");
            if (i == 19) {
                System.out.println("Thread: " + name + " is done.");
            }
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
