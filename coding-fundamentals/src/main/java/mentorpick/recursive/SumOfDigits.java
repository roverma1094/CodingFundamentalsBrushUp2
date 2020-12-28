package mentorpick.recursive;

import java.util.Scanner;

public class SumOfDigits {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			System.out.println(new SumOfDigits().sumOfDigits(N));
		}
	}

	int sumOfDigits(int n) {
		if (n > 0)
			return sumOfDigits(n / 10) + (n % 10);
		else
			return 0;
	}
}
