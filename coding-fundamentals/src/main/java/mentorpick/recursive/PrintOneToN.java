package mentorpick.recursive;

import java.util.Scanner;

public class PrintOneToN {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			new PrintOneToN().printOneToN(N);
		}
	}

	void printOneToN(int N) {
		if (N > 0) {
			printOneToN(N - 1);
			System.out.print(" " + N);
		}
	}
}
