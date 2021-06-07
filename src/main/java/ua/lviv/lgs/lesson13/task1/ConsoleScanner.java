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
        scanner = new java.util.Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("Incorrect format(String)! Try again!");
                scanner.next();
            }
        }
    }

    @Override
    public boolean readStringBribe() {
        System.out.println("Введіть Так або Ні");
        while (true){
            String input = readString();
            if (input.equalsIgnoreCase("так")){
                return true;
            }else if (input.equalsIgnoreCase("ні")){
                return false;
            }else{
                readStringBribe();
            }
        }
    }
}
