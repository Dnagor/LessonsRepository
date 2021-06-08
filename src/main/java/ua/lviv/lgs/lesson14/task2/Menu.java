package ua.lviv.lgs.lesson14.task2;


import java.util.*;


public class Menu {
    Set<Table> tableSet = new HashSet<>();
    Scanner scanner = new ConsoleScanner();

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
            switch (scanner.readString()) {
                case "1": {
                    tableSet.add(readTableParameters());
                    break;
                }
                case "2": {
                    System.out.println("Bведіть параметри столу який треба видалити: ");
                    Iterator<Table> iterator = tableSet.iterator();
                    Table readTableFromScanner = readTableParameters();
                    while (iterator.hasNext()) {
                        Table next = iterator.next();
                        if (next.equals(readTableFromScanner)) {
                            iterator.remove();
                            System.out.println(next+ " ВИДАЛЕНО!");
                        }
                    }
                    break;
                }
                case "3": {
                    System.out.println("Введіть параметри столу який треба замінити на новий:");
                    Iterator<Table> iterator = tableSet.iterator();
                    Table readTableFromScanner = readTableParameters();
                    while (iterator.hasNext()) {
                        Table next = iterator.next();
                        if (next.equals(readTableFromScanner)) {
                            iterator.remove();
                        }
                    }
                    System.out.println("Введіть параметри нового столу:");
                    tableSet.add(readTableParameters());
                    break;
                }
                case "4": {
                    Comparator<Table> tableNameComparator = new TableNameComparator();
                    sortedPrint(tableNameComparator);
                    break;
                }
                case "5": {
                    Comparator<Table> tableHeightComparator = new TableHeightComparator();
                    sortedPrint(tableHeightComparator);
                    break;
                }
                case "6": {
                    Comparator<Table> tableWidthComparator = new TableWidthComparator();
                    sortedPrint(tableWidthComparator);
                    break;

                }
                case "7": {
                    Comparator<Table> tableWeightComparator = new TableWeightComparator();
                    sortedPrint(tableWeightComparator);
                    break;
                }
                case "8": {
                    List<Table> tableList = new ArrayList<>(tableSet);
                    System.out.println("Введіть номер столу від 1 до "+tableList.size());
                    System.out.println(tableList.get((Integer.parseInt(scanner.readString()))-1));
                    break;
                }
                case "9": {
//                    flag = false;
                    System.out.println("Ви завершили програму.");
                    System.exit(0);
                    break;
                }

            }
        }
    }

    public Table readTableParameters() {
        System.out.println("Введіть назву столу:");
        String name = scanner.readString();
        System.out.println("Введіть вагу столу:");
        int weight = Integer.parseInt(scanner.readString());
        System.out.println("Введіть висоту столу:");
        int height = Integer.parseInt(scanner.readString());
        System.out.println("Введіть ширину столу:");
        int width = Integer.parseInt(scanner.readString());
        return new Table(name, width, height, weight);
    }

    private void sortedPrint(Comparator comparator) {
        List<Table> tableList = new ArrayList<>(tableSet);
        Collections.sort(tableList, comparator);
//        System.out.println(tableList);
        for (Table table : tableList) {
            System.out.println(table);
        }
    }

}
