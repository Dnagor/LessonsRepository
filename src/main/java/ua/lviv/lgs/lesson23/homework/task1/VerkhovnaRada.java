package ua.lviv.lgs.lesson23.homework.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VerkhovnaRada {
    private static VerkhovnaRada instance;
    private List<Faction> factions = new ArrayList<Faction>();

    public VerkhovnaRada(List<Faction> factions) {
        this.factions = factions;
    }

    public static VerkhovnaRada getInstance() {
        if (instance == null) {
            instance = new VerkhovnaRada(new ArrayList<Faction>());
        }
        return instance;
    }

    public List<Faction> getFactions() {
        return factions;
    }

    public void setFactions(List<Faction> factions) {
        this.factions = factions;
    }

    Scanner scanner = new ConsoleScanner();

    public Faction searchForFaction(String factionName){
        for (Faction fact : factions) {
            if (fact.getName().equalsIgnoreCase(factionName)) {
                return fact;
            }
        }
        return null;
    }
    public void addFaction(Faction faction) {
        factions.add(faction);
    }


    @Override
    public String toString() {
        return "VerkhovnaRada{" +
                "factions=" + factions +
                '}';
    }

    public void runMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Введіть 1 щоб додати фракцію.\n"
                    + "Введіть 2 щоб видалити конкретну фракцію\n"
                    + "Введіть 3 щоб вивести усі фракції\n"
                    + "Введіть 4 щоб очистити конкретку фракцію\n"
                    + "Введіть 5 щоб вивести конкретну фракцію\n"
                    + "Введіть 6 щоб додати депутата в фракцію\n"
                    + "Введіть 7 щоб видалити депутата з фракції\n"
                    + "Введіть 8 щоб вивести список хабарників\n"
                    + "Введіть 9 щоб дати хабар\n"
                    + "Введіть 10 щоб вивести найбільшого хабарника\n"
                    + "Ведіть 0 щоб завершити програму.\n"
            );
            switch (scanner.readString()) {
                case "1": {
                    System.out.println("Введіть назву фракції:");
                    String factionName = scanner.readString();
                    addFaction(new Faction(factionName));
                    System.out.println("Фракцію " + factionName + " додано.");
                    break;
                }
                case "2": {
                    System.out.println("Ведіть назву фракції яку треба видалити:");
                    String factionName = scanner.readString();
                    Iterator<Faction> iterator = factions.iterator();
                    while (iterator.hasNext()) {
                        Faction next = iterator.next();
                        if (next.getName().equalsIgnoreCase(factionName)) {
                            iterator.remove();
                            System.out.println("Фракцію " + next.getName() + " видалено з Верховної Ради.");
                        }
                    }
                    break;
                }
                case "3": {
                    System.out.println("Список фракцій Верховної ради:");
                    for (Faction fact : factions) {
                        System.out.println(fact);
                    }

                    break;
                }
                case "4": {
                    System.out.println("Введіть назву фракції з якої видалити всіх депутатів:");
                    String factionName = scanner.readString();
                    searchForFaction(factionName).removeAllDeputies();
                    break;
                }
                case "5": {
                    System.out.println("Введіть 5 щоб вевести конкретну фракцію");
                    String factionName = scanner.readString();
                    for (Faction fact : factions) {
                        if (fact.getName().equalsIgnoreCase(factionName)) {
                            System.out.println(fact);
                        }
                    }
                    break;
                }
                case "6": {
                    System.out.println("Введіть назву фракції в яку додати депутата:");
                    String factionName = scanner.readString();
                    for (Faction fact : factions) {
                        if (fact.getName().equalsIgnoreCase(factionName)) {
                            fact.addDeputy();
                        }
                        System.out.println();
                    }
                    break;
                }
                case "7":{
                    System.out.println("Введіть назву фракції з якої видалити депутата:");
                    String factionName = scanner.readString();
                    searchForFaction(factionName).removeDeputy();
                    break;
                }
                case "8": {
                    System.out.println("Введіть назву фракції в якій шукаєте хабарника:");
                    String factionName = scanner.readString();
                    for (Faction fact : factions) {
                        if (fact.getName().equalsIgnoreCase(factionName)) {
                            fact.printAllBribers();
                        }
                    }
                    break;
                }
                case "9":{
                    System.out.println("Введіть фракцію в якій депутат, якому дати хабар:");
                    String factionName = scanner.readString();
                    System.out.println("Введіть прізвище депутата хабарника:");
                    String lastName = scanner.readString();
                    System.out.println("Введіть ім'я депутата хабарника:");
                    String name = scanner.readString();
                    System.out.println("Введіть суму хабара:");
                    int bribe = Integer.parseInt(scanner.readString());
                    searchForFaction(factionName).giveBribe(bribe,name,lastName);

                    break;
                }
//                case "10":{
//                    System.out.println("Найбільший хабарник це:");
//                    for (Faction fact: factions) {
//                        fasct
//
//                    }
//
//                    break;
//                }
                case "0": {
                    flag = false;
                    System.out.println("Введіть 0 щоб завершити програму.");
                    break;
                }
            }
        }
    }

}
