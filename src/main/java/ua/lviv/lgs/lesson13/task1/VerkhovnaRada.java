package ua.lviv.lgs.lesson13.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    public void addDeputy() {
        System.out.println("Введіть фракцію:");
        String faction = scanner.readString();
        for (Faction factio : factions) {

        }
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
        Deputy deputy = new Deputy(lastName, name, height, weight, bribe);

    }

    public void giveBribe(int bribe, String deputyName, String deputyLastName, String factionName) {
        for (Faction faction : factions) {
            if (faction.getName().equalsIgnoreCase(factionName)) {
                faction.giveBribe(bribe, deputyName, deputyLastName);
            }

        }

    }

    public void addFaction(Faction faction) {
//        System.out.println("Введіть назву нової фракції:");
//        String name = scanner.readString();
        factions.add(faction);
//        Faction faction = new Faction(name);
//        factionList.add(faction);
    }

    public void removeFaction(List<Faction> factionList) {
        System.out.println("Введіть назву фракції яку хочете видалити:");
        String name = scanner.readString();
        ListIterator<Faction> listIterator = factionList.listIterator();
        while (listIterator.hasNext()) {
            Faction next = listIterator.next();
            if (next.getName().equalsIgnoreCase(name)) {
                listIterator.remove();
            }
        }
    }

    public void printAllFactions(List<Faction> factionList) {
        ListIterator<Faction> listIterator = factionList.listIterator();
        while (listIterator.hasNext()) {
            Faction next = listIterator.next();
            System.out.println(next);
        }
    }

    public void printSelectedFaction(List<Faction> factionList) {
        System.out.println("Введіть назву фракції яку хочете видалити:");
        String name = scanner.readString();
        ListIterator<Faction> listIterator = factionList.listIterator();
        while (listIterator.hasNext()) {
            Faction next = listIterator.next();
            if (next.getName().equalsIgnoreCase(name)) {
                System.out.println(next);
            }
        }
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
                    + "Введіть 2 щоб видалити фракцію\n"
                    + "Введіть 3 щоб вивести усі фракції\n"
                    + "Введіть 4 щоб очистити конкретку фракцію\n"
                    + "Введіть 5 щоб вевести конкретну фракцію\n"
                    + "Введіть 6 щоб додати депутата в фракцію\n"
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
                    for (Faction fact : factions) {
                        if (fact.getName().equalsIgnoreCase(factionName)) {
                           fact.removeAllDeputies(fact);
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("вВедіть 5 щоб вевести конкретну фракцію");
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
                        break;
                    }
                }
                case "0": {
                    flag = false;
                    System.out.println("Введіть 0 щоб завершити програму.");
                    break;
                }
            }
        }
    }

}
