package ua.lviv.lgs.lesson10;


import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("To replace all vowels - enter a sentence.");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().toLowerCase();
		System.out.println("Enter a char to which you want to change.");
		String replaceChar = sc.next();
		sentence = Task2.replaceVowelsWithChar(sentence,replaceChar.charAt(0));
		System.out.println(sentence);
		
		
	}

	static String replaceVowelsWithChar(String sent,char replaceChar) {
		sent = sent.replace('a', replaceChar);
		sent = sent.replace('e', replaceChar);
		sent = sent.replace('i', replaceChar);
		sent = sent.replace('o', replaceChar);
		sent = sent.replace('u', replaceChar);
		
		return sent;
	}
	
}
