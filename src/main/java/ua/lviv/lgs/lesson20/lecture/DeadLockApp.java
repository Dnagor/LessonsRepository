package ua.lviv.lgs.lesson20.lecture;

import java.util.concurrent.RecursiveAction;
//Обєкти посилаються один на одного. Програма може зависнути через неправильну структуру. так не можна робити.
public class DeadLockApp {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.resourceA = resourceA;
        t2.resourceB = resourceB;

        t1.start();
        t2.start();
    }
}

class ResourceA {
    ResourceB resourceB;

    public synchronized int getNumber() {
        return resourceB.returnNumber();
    }

    public synchronized int returnNumber() {
        return 1;
    }
}

class ResourceB {
    ResourceA resourceA;

    public synchronized int getNumber() {
        return resourceA.returnNumber();
    }

    public synchronized int returnNumber() {
        return 5;
    }
}
class MyThread1 extends Thread{
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getNumber());
    }
}
class MyThread2 extends Thread{
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.println(resourceB.getNumber());
    }
}