package assessment;

import java.util.Scanner;

public class RomanNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Roman Number : ");
		String romanNumeral = sc.nextLine(); // IX
		sc.close();
		int result = romanToInt(romanNumeral.toUpperCase());
		System.out.println("Integer value: " + result);
	}

	public static int romanToInt(String s) {
		int x = 0, y = 0, sum = 0;
		// it will iterate the length of the String
		for (int i = s.length() - 1; i >= 0; i--) {
			// it will store each char in ch
			char ch = s.charAt(i);
			// it will each char to the condition
			if (ch == 'I') {
				x = 1;
			} else if (ch == 'V') {
				x = 5;
			} else if (ch == 'X') {
				x = 10;
			} else if (ch == 'L') {
				x = 50;
			} else if (ch == 'C') {
				x = 100;
			} else if (ch == 'D') {
				x = 500;
			} else if (ch == 'M') {
				x = 1000;
			}
			// if x value is less than y value
			if (x < y) {
				// it will sub sum=sum-x else sum=sum+x
				sum -= x; // 10-1 = 9
			} else {
				sum += x; // 10
			}
			// y value equals x value
			y = x; // 1
		}
		// after the iterations it will return sum value
		return sum; // 9
	}

}
