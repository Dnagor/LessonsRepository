package ua.lviv.lgs.lesson23.homework.task1;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Faction {
    Supplier<String> readString = () -> {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            if (sc.hasNextLine()) {
                return sc.nextLine();
            } else {
                System.out.println("Incorrect format(String)! Try again!");
                sc.next();
            }
        }
    };
    private String name;
    private List<Deputy> deputies = new ArrayList<>();

    public Faction(String name) {
        this.name = name;
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void giveBribe(int bribe, String deputyName, String deputyLastName) {
        deputies.stream().forEach(deputy -> {
            if (deputy.getName().equalsIgnoreCase(deputyName) && deputy.getLastName().equalsIgnoreCase(deputyLastName)) {
                deputy.giveBribe(bribe);
            }
        });
    }

    public void removeDeputy() {
        System.out.println("Введіть прізвище депутата:");
        String lastName = readString.get();
        System.out.println("Введіть ім'я депутата:");
        String name = readString.get();
        deputies.removeIf(deputy -> deputy.getName().equalsIgnoreCase(name) && deputy.getLastName().equalsIgnoreCase(lastName));
    }

    public void addDeputy() {
        System.out.println("Введіть прізвище депутата:");
        String lastName = readString.get();
        System.out.println("Введіть ім'я депутата:");
        String name = readString.get();
        System.out.println("Введіть вагу депутата:");
        int weight = Integer.parseInt(readString.get());
        System.out.println("Введіть зріст депутата:");
        int height = Integer.parseInt(readString.get());
        System.out.println("Вкажіть чи депутат бере хабарі:");
        boolean bribe = readStringBribe();
        deputies.add(new Deputy(lastName, name, weight, height, bribe));
    }

    public void printAllBribers() {
        deputies.stream().filter(deputy -> deputy.isBriber()).forEach(System.out::println);
    }


    public void removeAllDeputies() {
        deputies = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                ", deputies=" + deputies +
                '}';
    }

    public boolean readStringBribe() {
        System.out.println("Введіть Так або Ні");
        while (true) {
            String input = readString.get();
            if (input.equalsIgnoreCase("так")) {
                return true;
            } else if (input.equalsIgnoreCase("ні")) {
                return false;
            } else {
                readStringBribe();
            }
        }
//    public void findBiggestBriber(){
//        ListIterator<Deputy> deputyListIterator = deputies.listIterator();
//        Deputy next = deputyListIterator.next();
//        while (deputyListIterator.hasNext()){
//            if(next.getAmountOfBribe()>next)
//
//    }
//
//    }

    }
}
