package ua.lviv.lgs.lesson12.task1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lesson12Homework {

    public static void main(String[] args) {
        List<Months> monthsList = new ArrayList<>(Arrays.asList(Months.values()));
        Scanner sc = new Scanner(System.in);
        boolean session = true;
        while (session) {
            menu();

            switch (sc.next()) {

                case "1": {
                    System.out.println("Enter name of month: ");
                    String month = sc.next();
                    checkIfExixts(monthsList, month);
                    break;
                }
                case "2": {
                    System.out.println("Enter season name: ");
                    String season = sc.next();
                    boolean flag = false;
                    System.out.println("These are months from season you entered:");
                    for (Months months2 : monthsList) {
                        if (season.equalsIgnoreCase(months2.seasons.name())) {
                            System.out.println(months2.name());
                            flag = true;
                        }
                    }
                    System.out.println();
                    if (!flag) {
                        try {
                            String mess = "\nThere is no such season. \n";
                            throw new WrongInputConsoleParametersExeption(mess); // Throws exception when wrong input is
                            // made. Program continues to run.
                        } catch (WrongInputConsoleParametersExeption e) {
                            System.err.println(e.getMessage());
                        }

                    }
                    break;
                }
                case "3": {
                    System.out.println("Enter how many days from 28, 30 or 31:");
                    Integer days = sc.nextInt();
                    boolean flag = false;
                    for (Months months2 : monthsList) {
                        if (days.equals(months2.getDays())) {
                            System.out.println(months2.name());
                            flag = true;
                        }
                    }
                    if (!flag) {
                        try {
                            String mess = "Enter correct number of days.\n";
                            throw new WrongInputConsoleParametersExeption(mess); // Throws exception when wrong input is
                            // made. Program continues to run.
                        } catch (WrongInputConsoleParametersExeption e) {
                            System.err.println(e.getMessage());
                        }

                    }
                    break;
                }
                case "4": {
                    System.out.println("Enter how many days to check from 28 to 31:");
                    Integer days = sc.nextInt();
                    boolean flag = false;
                    for (Months months2 : monthsList) {
                        if (days > months2.getDays() && days < 32 && days > 27) {
                            System.out.println(months2);
                            flag = true;
                        }
                    }
                    if (!flag && days != 28) {
                        try {
                            String mess = "\nThere are no months with lower quantity of days,\n or you dummy entered wrong number.";
                            throw new WrongInputConsoleParametersExeption(mess); // Throws exception when wrong input is
                            // made. Program continues to run.
                        } catch (WrongInputConsoleParametersExeption exp) {
                            System.err.println(exp.getMessage());
                        }
                    }
                    if (days == 28) {
                        System.out.println("There are no months with lower quantity of days than 28.\n");
                    }
                    break;
                }
                case "5": {
                    System.out.println("Enter how many days to check from 28 to 31:");
                    Integer days = sc.nextInt();
                    boolean flag = false;
                    for (Months months2 : monthsList) {
                        if (days < months2.getDays() && days < 32 && days > 27) {
                            System.out.println(months2);
                            flag = true;
                        }
                    }
                    if (!flag && days != 31) {
                        try {
                            String mess = "There are no months with bigger quantity of days, or you dummy entered wrong number.";
                            throw new WrongInputConsoleParametersExeption(mess); // Throws exception when wrong input is
                            // made. Program continues to run.
                        } catch (WrongInputConsoleParametersExeption exp) {
                            System.err.println(exp.getMessage());
                        }

                    }

                    if (days == 31) {
                        System.out.println("There are no months with bigger quantity of days than 31.\n");
                    }
                    break;
                }
                case "6": {
                    System.out.println("Enter name of month:");
                    String month = sc.next().toUpperCase();
                    boolean flag = checkIfExixts(monthsList, month);

                    if (flag) {
                        Months month1 = Months.valueOf(month);
                        Seasons[] seasons = Seasons.values();
                        int ordinal = month1.seasons.ordinal();
                        if (ordinal == seasons.length - 1) {
                            ordinal = 0;
                            System.out.println("Next season is: " + seasons[ordinal]);
                            System.out.println("Previous season is: " + seasons[seasons.length - 2]);
                        } else if (ordinal == 0) {
                            System.out.println("Next season is: " + seasons[ordinal + 1]);
                            System.out.println("previous season is: " + seasons[seasons.length - 1]);
                        } else if (ordinal != monthsList.size()) {
                            System.out.println("Next season is: " + seasons[ordinal + 1]);
                            System.out.println("Previous season is: " + seasons[ordinal - 1]);
                        }
                    }
                    break;
                }
                case "7": {
                    System.out.println("Here you can see months with even number of days:");
                    hasEvenDays(monthsList);
                    System.out.println();
                    break;
                }
                case "8": {

                    System.out.println("Here you can see months with uneven number of days:");

                    for (Months months2 : monthsList) {
                        if (months2.getDays() % 2 != 0) {
                            System.out.println(months2.name());
                        }
                    }
                    System.out.println();
                    break;

                }
                case "9": {
                    System.out.println("Enter name of month:");
                    String month = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Months months2 : monthsList) {
                        if (month.equalsIgnoreCase(months2.name()) && months2.getDays() % 2 == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("Yes, this month has even number of days.");
                    } else if (!flag) {
                        String mess = "\nThere is no such month. \n";
                        try {
                            throw new WrongInputConsoleParametersExeption(mess); // Throws exception when wrong input is made.
                        } catch (WrongInputConsoleParametersExeption wrongInputConsoleParametersExeption) {
                            wrongInputConsoleParametersExeption.printStackTrace();
                        }


                    } else {
                        System.out.println("No, this month has uneven number of days.");

                    }
                    break;
                }
                default: {
                    System.out.println("      PLEASE ENTER A NUMBER FROM THE LIST BELOW         \n");
                }
                case "10": {
                    session = false;
                    sc.close();
                }

            }
        }

    }

    /**
     * Checks if entered month has even days or not.
     */
    public static void hasEvenDays(List<Months> monthsList) {
        for (Months months2 : monthsList) {
            if (months2.getDays() % 2 == 0) {
                System.out.println(months2.name());
            }
        }
    }

    /**
     * Checks if month exists
     *
     * @param monthsList, values from array month from enum.
     * @param month,  value from scanner.
     * @return boolean.
     */
    private static boolean checkIfExixts(List<Months> monthsList, String month) {
        boolean flag = false;
        for (Months months2 : monthsList) {
            if (month.equalsIgnoreCase(months2.name())) {
                flag = true;
                System.out.println("This month exists.\n");
            }

        }
        if (!flag) {
            try {
                String mess = "There is no such month. \n";
                throw new WrongInputConsoleParametersExeption(mess);
            } catch (WrongInputConsoleParametersExeption e) {

                System.err.println(e.getMessage());
            }
        }
        return flag;
    }

    /**
     * Prints menu with options for choosing.
     */
    static void menu() {
        System.out.println("Press 1 to check if month exists.");
        System.out.println("Press 2 to see all months from season.");
        System.out.println("Press 3 to see all months with the same quantity of days.");
        System.out.println("Press 4 to see months with smaller quantity of days.");
        System.out.println("Press 5 to see months with bigger quantity of days.");
        System.out.println("Press 6 to see next and previous season.");
        System.out.println("Press 7 to see months that have even number of days");
        System.out.println("Press 8 to see months that have uneven number of days.");
        System.out.println("Press 9 to see months that have uneven number of days.");
        System.out.println("Press 10 to exit.");

    }
}



