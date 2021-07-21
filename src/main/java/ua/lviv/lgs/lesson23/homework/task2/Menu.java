package ua.lviv.lgs.lesson23.homework.task2;


import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class Menu {
    Set<Table> tableSet = new HashSet<>();
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

    public void runMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Натисніть 1 щоб додати стіл.\n"
                    + "Натисніть 2 щоб видалити стіл.\n"
                    + "Натисніть 3 щоб замінити стіл.\n"
                    + "Натисніть 4 щоб сортувати за назвою.\n"
                    + "Натисніть 5 щоб сортувати за висотою.\n"
                    + "Натисніть 6 щоб сортувати за шириною.\n"
                    + "Натисніть 7 щоб сортувати за вагою.\n"
                    + "Натисніть 8 щоб вивсести стіл за номером.\n"
                    + "Натисніть 9 щоб вийти з програми.");
            switch (readString.get()) {
                case "1": {
//                    tableSet.add(readTableParameters());
                    tableSet.add(new Table("Test", 1,2,44));
                    tableSet.add(new Table("Best", 3,1,24));
                    tableSet.add(new Table("Quest", 11,3,14));
                    tableSet.add(new Table("Arac", 4,1,4));
                    break;
                }
                case "2": {
                    System.out.println("Bведіть параметри столу який треба видалити: ");
                    Table readTableFromScanner = readTableParameters();
                    tableSet.removeIf(table -> table.getName().equals(readTableFromScanner.getName()));
                    break;
                }
                case "3": {
                    System.out.println("Введіть параметри столу який треба замінити на новий:");
                    Table readTableFromScanner = readTableParameters();
                    Set<Table> duplicate = new HashSet<>(tableSet);
                    duplicate.stream().filter(table -> table.equals(readTableFromScanner))
                            .forEach(tableSet::remove);
                    System.out.println("Введіть параметри нового столу:");
                    tableSet.add(readTableParameters());
                    break;
                }
                case "4": {
                    Comparator<Table> tableNameComparator = new TableNameComparator();
                    tableSet.stream().sorted(tableNameComparator).forEach(table -> System.out.println(table));
                    break;
                }
                case "5": {
                    Comparator<Table> tableHeightComparator = new TableHeightComparator();
                    tableSet.stream().sorted(tableHeightComparator).forEach(table -> System.out.println(table));
                    break;
                }
                case "6": {
                    Comparator<Table> tableWidthComparator = new TableWidthComparator();
                    tableSet.stream().sorted(tableWidthComparator).forEach(table -> System.out.println(table));
                    break;

                }
                case "7": {
                    Comparator<Table> tableWeightComparator = new TableWeightComparator();
                    tableSet.stream().sorted(tableWeightComparator).forEach(table -> System.out.println(table));
                    break;
                }
                case "8": {
                    List<Table> tableList = new ArrayList<>(tableSet);
                    System.out.println("Введіть номер столу від 1 до " + tableList.size());
                    System.out.println(tableList.get((Integer.parseInt(readString.get())) - 1));
                    break;
                }
                case "9": {
                    System.out.println("Ви завершили програму.");
                    System.exit(0);
                    break;
                }

            }
        }
    }

    public Table readTableParameters() {
        System.out.println("Введіть назву столу:");
        String name = readString.get();
        System.out.println("Введіть вагу столу:");
        int weight = Integer.parseInt(readString.get());
        System.out.println("Введіть висоту столу:");
        int height = Integer.parseInt(readString.get());
        System.out.println("Введіть ширину столу:");
        int width = Integer.parseInt(readString.get());
        return new Table(name, width, height, weight);
    }
}
