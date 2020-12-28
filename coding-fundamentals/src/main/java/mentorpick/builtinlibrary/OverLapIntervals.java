package mentorpick.builtinlibrary;

import java.util.Scanner;

public class OverLapIntervals {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			int s1 = sc.nextInt();
			int e1 = sc.nextInt();
			int s2 = sc.nextInt();
			int e2 = sc.nextInt();

			System.out.println(Math.min(s2, s1) + " " + Math.max(e2, e1));
		}
	}

}
