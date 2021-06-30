package ua.lviv.lgs.lesson20.homework;

public class RunnableThread implements Runnable {

    Scanner scanner = new ConsoleScanner();
    @Override
    public void run() {

        System.out.println("Введіть кількість чисел фібоначчі які бажаєте побачити: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        array[1]=1;
        array[0]=1;
        if (number >= 2) {
            int x = 1;
            int y = 1;
            for (int i = 2; i < number; i++) {
                y = x + y;
                x = y - x;
                array[i] = y;
            }
            System.out.print("Потік Runnable: ");
            for (int i = array.length-1; i >=0 ; i--) {
                System.out.print(array[i]+ " ");
                sleep();
            }
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
