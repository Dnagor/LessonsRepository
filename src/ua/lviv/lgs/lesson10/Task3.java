package ua.lviv.lgs.lesson10;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: \n");
		String sentence = sc.nextLine();
		String[] sentenceArr = sentence.split("[.]|!|[?]");
		for (String line : sentenceArr) {
			System.out.println(line);
			sc.close();
		}

	}
}
