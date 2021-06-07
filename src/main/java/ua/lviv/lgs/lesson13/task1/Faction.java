package ua.lviv.lgs.lesson13.task1;


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
            }
        }
    }

    public void removeDeputy() {
        System.out.println("Введіть прізвище депутата:");
        String lastName = scanner.readString();
        System.out.println("Введіть ім'я депутата:");
        String name = scanner.readString();
        ListIterator<Deputy> deputyListIterator = deputies.listIterator();
        while (deputyListIterator.hasNext()){
            Deputy next = deputyListIterator.next();
            if(next.getName().equalsIgnoreCase(name)&&next.getLastName().equalsIgnoreCase(lastName)){
                deputyListIterator.remove();
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

    public void printAllBribers() {
        for (Deputy deputy : deputies) {
            if(deputy.isBriber()){
                System.out.println(deputy.toString());
            }
            
        }
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
