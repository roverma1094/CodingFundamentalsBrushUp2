package mentorpick.recursive;

import java.util.Scanner;

public class Factorial {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			System.out.println(new Factorial().factorial(N));
		}
	}

	long factorial(int n) {
		if (n != 0) {
			int b = n - 1;
			if (b != 0) {
				return n * factorial(b);
			} else {
				return n;
			}
		}else {
			return 1;
		}
	}
}
