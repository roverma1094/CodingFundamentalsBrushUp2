package mentorpick;

import java.util.Scanner;

public class PowerOf8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(new PowerOf8().isPowerOfTwo(n));
	}

	boolean isPowerOfTwo(int n) {
		if (n != 0) {
			return (n & (n - 1)) == 0 ? true : false;
		} else {
			return false;
		}
	}
}
