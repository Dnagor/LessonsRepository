package ua.lviv.lgs.lesson20.homework;

public class MyThread extends Thread  {
    Scanner scanner = new ConsoleScanner();
    @Override
    public void run() {
        System.out.println("Введіть кількість чисел фібоначчі які бажаєте побачити: ");
        int number = scanner.nextInt();
        if (number >= 2) {
            System.out.print("Потік Thread : " +1);
            sleep();
            System.out.print(" "+1);
            sleep();
            int x = 1;
            int y = 1;
            for (int i = 2; i < number; i++) {
                y = x + y;
                x = y - x;
                System.out.print(" " + y);
                sleep();
            }
           // scanner.close();
        } else if(number == 1){
            System.out.println("Потік Thread: " +1);
        }else {
            System.out.println("Введіть додатнє число від 1 до числа в розумних межах =)");
            run();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
