package ua.lviv.lgs.lesson20.homework;

public class FibonacciSequence {
    public static void main(String[] args) {
        ConsoleScanner scanner = new ConsoleScanner();
        System.out.println("Оберіть потік: \n 1:MyThread. \n 2:RunnableThread.");
        int i = scanner.nextInt();
        switch (i) {
            case(1):{
                MyThread myThread = new MyThread();
                myThread.start();
                break;
            }
            case(2):{
                RunnableThread runnableThread = new RunnableThread();
                Thread thread = new Thread(runnableThread);
                thread.start();
                break;
            }
        }
    }


}
