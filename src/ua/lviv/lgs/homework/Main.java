package ua.lviv.lgs.homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Months[] months = Months.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {

			case "1": {
				System.out.println("Enter name of month: ");
				String month = sc.next();
				boolean flag = checkIfExixts(months, month);
				break;
			}
			case "2": {
				System.out.println("Enter season name: ");
				String season = sc.next();
				boolean flag = false;
				System.out.println("These are months from season you entered:");
				for (Months months2 : months) {
					if (season.equalsIgnoreCase(months2.seasons.name())) {
						System.out.println(months2.name());
						flag = true;
					}
				}
				System.out.println();
				if (!flag) {
					System.out.println("There is no such season. \n");

				}
				break;
			}
			case "3": {
				System.out.println("Enter how many days from 28, 30 or 31:");
				Integer days = sc.nextInt();
				boolean flag = false;
				for (Months months2 : months) {
					if (days.equals(months2.getDays())) {
						System.out.println(months2.name());
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Enter correct number of days.\n");
				}
				break;
			}
			case "4": {
				System.out.println("Enter how many days to check from 28 to 31:");
				Integer days = sc.nextInt();
				boolean flag = false;
				for (Months months2 : months) {
					if (days > months2.getDays() && days < 32 && days > 27) {
						System.out.println(months2);
						flag = true;
					}
				}
				if (!flag && days != 28) {
					System.out.println(
							"There are no months with lower quantity of days, or you dummy entered wrong number.");
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
				for (Months months2 : months) {
					if (days < months2.getDays() && days < 32 && days > 27) {
						System.out.println(months2);
						flag = true;
					}
				}
				if (!flag && days != 31) {
					System.out.println(
							"There are no months with bigger quantity of days, or you dummy entered wrong number.");
				}
				if (days == 31) {
					System.out.println("There are no months with bigger quantity of days than 31.\n");
				}
				break;
			}
			case "6": {
				System.out.println("Enter name of month:");
				String month = sc.next().toUpperCase();
				boolean flag = checkIfExixts(months, month);

				if (flag) {
					Months month1 = Months.valueOf(month);
					Seasons[] seasons = ua.lviv.lgs.homework.Seasons.values();
					int ordinal = month1.seasons.ordinal();
					if (ordinal == seasons.length - 1) {
						ordinal = 0;
						System.out.println("Next season is: " + seasons[ordinal]);
						System.out.println("Previous season is: " + seasons[seasons.length - 2]);
					} else if (ordinal == 0) {
						System.out.println("Next season is: " + seasons[ordinal + 1]);
						System.out.println("previous season is: " + seasons[seasons.length - 1]);
					} else if (ordinal != months.length) {
						System.out.println("Next season is: " + seasons[ordinal + 1]);
						System.out.println("Previous season is: " + seasons[ordinal - 1]);
					}
				}
				break;
			}
			case "7": {
				System.out.println("Here you can see months with even number of days:");
				hasEvenDays(months);
				System.out.println();
				break;
			}
			case "8": {

				System.out.println("Here you can see months with uneven number of days:");

				for (Months months2 : months) {
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
				for (Months months2 : months) {
					if (month.equalsIgnoreCase(months2.name()) && months2.getDays() % 2 == 0) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("Yes, this month has even number of days.");
				} else if (!flag) {
					System.out.println("There is no such month. \n");
				} else {
					System.out.println("No, this month has uneven number of days.");

				}
				break;
			}
			default: {
				System.out.println("      PLEASE ENTER A NUMBER FROM THE LIST BELOW         \n");
			}
			}
		}

	}

	public static void hasEvenDays(Months[] months) {
		for (Months months2 : months) {
			if (months2.getDays() % 2 == 0) {
				System.out.println(months2.name());
			}
		}
	}

	private static boolean checkIfExixts(Months[] months, String month) {
		boolean flag = false;
		for (Months months2 : months) {
			if (month.equalsIgnoreCase(months2.name())) {
				flag = true;
				System.out.println("This month exists.\n");
			}

		}
		if (!flag) {
			System.out.println("There is no such month. \n");
		}
		return flag;
	}

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

	}
}
