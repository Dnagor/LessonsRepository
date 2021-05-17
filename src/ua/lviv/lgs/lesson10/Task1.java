package ua.lviv.lgs.lesson10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("To check if word is a palindrome enter a word that contains 5 letters:");
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase();
		if (word.length() != 5) {
			System.err.println("Please restart program.\nAnd enter word which contains 5 letters.");
		} else {
			if (word.charAt(0) == word.charAt(4) && word.charAt(1) == (word.charAt(3))) {
				System.out.println("Word: " + word + " is a palindrome.");
			}else {
				System.out.println("Word: "+word+" is not a palindrome.");
			}
		}
		
	

	}

}
