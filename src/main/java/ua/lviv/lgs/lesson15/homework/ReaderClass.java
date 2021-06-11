package ua.lviv.lgs.lesson15.homework;

public class ReaderClass implements Reader {
    private java.util.Scanner scanner;

    public ReaderClass() {
        scanner = new java.util.Scanner(System.in);
    }

    @Override
    public String readString() {
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else System.out.println("Введіть правильні дані!(String)");
        }
    }
}
