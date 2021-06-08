package ua.lviv.lgs.lesson14.task2;

public class ConsoleScanner implements Scanner{

    private java.util.Scanner scanner;

    public ConsoleScanner() {
        scanner = new java.util.Scanner(System.in);
    }

    @Override
    public String readString() {
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("Incorrect format(String)! Try again!");
                scanner.next();
            }
        }
    }
}
