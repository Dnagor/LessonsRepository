package ua.lviv.lgs.homeworkFromLesson9;

import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Throwable {
	Methods m = new Methods();
	Scanner sc = new Scanner(System.in);

	System.out.println("Please enter first number");
	m.a = sc.nextInt();
	System.out.println("Please enter second number");
	m.b = sc.nextInt();
	sc.close();
	m.sum(m.a, m.b);

	m.sub(m.a, m.b);

	m.mult(m.a, m.b);

	m.div(m.a, m.b);
}
}
