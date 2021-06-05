package ua.lviv.lgs.lesson13.task1;

import com.sun.org.apache.bcel.internal.generic.FCMPG;

import java.util.*;

public class Faction {
    private String name;
    private List<Deputy> deputies = new ArrayList<>();
    Scanner scanner = new ConsoleScanner();

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
        for (Deputy deputy : deputies) {
            if (deputy.getName().equalsIgnoreCase(deputyName) && deputy.getLastName().equalsIgnoreCase(deputyLastName)) {
                deputy.giveBribe(bribe);
                return;
            }
        }
    }

    public void removeDeputy(List<Deputy> deputyList) {
        ListIterator<Deputy> listIterator = deputyList.listIterator();
        System.out.println("Введіть прізвище депутата:");
        String lastName = scanner.readString();
        System.out.println("Введіть ім'я депутата:");
        String name = scanner.readString();
        while (listIterator.hasNext()) {
            Deputy next = listIterator.next();
            if (next.getLastName().equalsIgnoreCase(lastName) && next.getName().equalsIgnoreCase(name)) {
                listIterator.remove();
            }
        }
    }

    public void addDeputy() {
        System.out.println("Введіть прізвище депутата:");
        String lastName = scanner.readString();
        System.out.println("Введіть ім'я депутата:");
        String name = scanner.readString();
        System.out.println("Введіть вагу депутата:");
        int weight = scanner.readInt();
        System.out.println("Введіть зріст депутата:");
        int height = scanner.readInt();
        System.out.println("Вкажіть чи депутат бере хабарі:");
        boolean bribe = scanner.readStringBribe();
        deputies.add(new Deputy(lastName,name,weight,height,bribe));
    }

    public void printAllBribers(List<Deputy> deputyList) {
        ListIterator<Deputy> listIterator = deputyList.listIterator();
        while (listIterator.hasNext()) {
            Deputy next = listIterator.next();
            if (next.isBriber()) {
                System.out.println(next);
            }
        }
    }

    public void printBiggestBriber(List<Deputy> deputyList) {
        Collections.sort(deputyList, new DepytyBribeComparator());
        System.out.println(deputyList.get(1));
    }

    public void printAllDeputies(List<Deputy> deputyList) {
        ListIterator<Deputy> listIterator = deputyList.listIterator();
        while (listIterator.hasNext()) {
            Deputy next = listIterator.next();
            System.out.println(next);
        }
    }

    public void removeAllDeputies(Faction faction) {
        Iterator<Deputy> iterator = faction.getDeputies().iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
//        System.out.println( faction.getDeputies());
//        ListIterator<Deputy> listIterator = deputyList.listIterator();
//        while (listIterator.hasNext()) {
//            Deputy next = listIterator.next();
//            System.out.println(next);
//        }
    }

    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                ", deputies=" + deputies +
                '}';
    }


}
