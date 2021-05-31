package ua.lviv.lgs.lesson10;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Enter a sentence:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().toLowerCase();
		String[] words = sentence.split(" ");
		int count1 = 0;
		int count2 = 0;

		String mostRepeatedWord = null;

		for (int i = 0; i < words.length; i++) {

			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {

					count1++;
				}
				if (count1 > count2) {
					count2 = count1;
					mostRepeatedWord = words[i];
				}
			}
			count1 = 0;
		}

		System.out.println(mostRepeatedWord);
		sc.close();
	}

}
