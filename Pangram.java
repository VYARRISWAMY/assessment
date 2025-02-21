package assessment;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		System.out.println("Write your Sentence to check Pangram or Not");
		Scanner sc = new Scanner(System.in); // the five boxing wizards jump quickly
		String sent = sc.nextLine();
		sc.close();
		if (pangram(sent))
			System.out.println("The given sentence is a pangram.");
		else
			System.out.println("The given sentence is not a pangram.");
	}

	public static boolean pangram(String str) {
		// it will create a boolean array of 26 size with default value false
		boolean alph[] = new boolean[26];
		// it will all space special char in the sentence
		String str1 = str.replaceAll("[ !@#$%^&*()]", "").toLowerCase();
		// it will iterate String (str1)
		for (int i = 0; i < str1.length(); i++) {
			// it will store each char in ch
			char ch = str1.charAt(i);
			// if the char is equals a - less than are equals to z i.e (a-z)
			if (ch >= 'a' && ch <= 'z') {
				// the store ch a=97 (97-97) = 0
				// alph[0]=true
				alph[ch - 'a'] = true;
			}
		}
		// it will iterate boolean array
		for (int i = 0; i < alph.length; i++) {
			// if any alph boolean store false it will return false
			if (alph[i] == false)
				return false;
		}
		// after the iteration of alph boolean array it will return true
		return true;
	}
}
