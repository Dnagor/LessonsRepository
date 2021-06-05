package ua.lviv.lgs.lesson13.task1;

public class ConsoleScanner implements Scanner {
    private java.util.Scanner scanner;

    public ConsoleScanner() {
        scanner = new java.util.Scanner(System.in);
    }

    @Override
    public int readInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Incorrect format(int)! Try again!");
                scanner.next();
            }
        }
    }

    @Override
    public String readString() {
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("Incorrect format(int)! Try again!");
                scanner.next();
            }
        }
    }

    @Override
    public boolean readStringBribe() {
        System.out.println("Введіть Так або Ні");
        while (true){
            if (readString().equalsIgnoreCase("так")){
                return true;
            }else if (readString().equalsIgnoreCase("ні")){
                return false;
            }
        }
    }
}
