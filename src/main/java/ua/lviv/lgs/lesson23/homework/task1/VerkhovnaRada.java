package ua.lviv.lgs.lesson23.homework.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

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

    public Faction searchForFaction(String factionName){
        Optional<Faction> matchingObject = factions.stream().
                filter(p -> p.getName().equals(factionName)).
                findFirst();
        return matchingObject.get();
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
                    + "Введіть 0 щоб завершити програму.\n"
            );
            switch (readString.get()) {
                case "1": {
                    System.out.println("Введіть назву фракції:");
                    String factionName = readString.get();
                    addFaction(new Faction(factionName));
                    System.out.println("Фракцію " + factionName + " додано.");

                    break;
                }
                case "2": {
                    System.out.println("Ведіть назву фракції яку треба видалити:");
                    String factionName = readString.get();
                    factions.removeIf(faction -> faction.getName().equals(factionName));
                    break;
                }
                case "3": {
                    System.out.println("Список фракцій Верховної ради:");
                    factions.stream().forEach(faction -> System.out.println(faction));

                    break;
                }
                case "4": {
                    System.out.println("Введіть назву фракції з якої видалити всіх депутатів:");
                    String factionName = readString.get();
                    searchForFaction(factionName).removeAllDeputies();
                    break;
                }
                case "5": {
                    System.out.println("Введіть назву фракції яку вивести");
                    String factionName = readString.get();
                    factions.stream().filter(faction -> faction.getName().equalsIgnoreCase(factionName)).forEach(System.out::println);
                    break;
                }
                case "6": {
                    System.out.println("Введіть назву фракції в яку додати депутата:");
                    String factionName = readString.get();
                    factions.stream().filter(faction -> faction.getName().equalsIgnoreCase(factionName)).forEach(faction -> faction.addDeputy());
                    break;
                }
                case "7":{
                    System.out.println("Введіть назву фракції з якої видалити депутата:");
                    String factionName = readString.get();
                    searchForFaction(factionName).removeDeputy();
                    break;
                }
                case "8": {
                    System.out.println("Введіть назву фракції в якій шукаєте хабарника:");
                    String factionName = readString.get();
                    factions.stream().filter(faction -> faction.getName().equalsIgnoreCase(factionName)).forEach(Faction::printAllBribers);
                    break;
                }
                case "9":{
                    System.out.println("Введіть фракцію в якій депутат, якому дати хабар:");
                    String factionName = readString.get();
                    System.out.println("Введіть прізвище депутата хабарника:");
                    String lastName = readString.get();
                    System.out.println("Введіть ім'я депутата хабарника:");
                    String name = readString.get();
                    System.out.println("Введіть суму хабара:");
                    int bribe = Integer.parseInt(readString.get());
                    searchForFaction(factionName).giveBribe(bribe,name,lastName);
                    break;
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
