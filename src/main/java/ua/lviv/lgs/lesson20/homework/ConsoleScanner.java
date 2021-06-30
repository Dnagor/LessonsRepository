package ua.lviv.lgs.lesson20.homework;

public class ConsoleScanner implements Scanner{
    private java.util.Scanner scanner;

    public ConsoleScanner() {
        scanner = new java.util.Scanner(System.in);
    }
    @Override
    public int nextInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Incorrect format(int)! Try again!");
                scanner.next();
            }
        }
    }
}
