package mentorpick.recursive;

import java.util.Scanner;

public class PrintPatternDiff5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			new PrintPatternDiff5().printPatternDiff5(N);
		}
	}

	void printPatternDiff5(int n) {
		printPattern(n, n, -5);
	}

	private void printPattern(int originalNumber, int currentNumber, int five) {
		if (currentNumber <= 0) {
			five = (-1 * five);
		}
		if (currentNumber <= originalNumber) {
			System.out.print(currentNumber + " ");
			printPattern(originalNumber, currentNumber + five, five);
		}
	}
}
