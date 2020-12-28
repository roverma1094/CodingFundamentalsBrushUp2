package interviewbit;

import java.util.Scanner;

public class TrailingZero {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			System.out.println(new TrailingZero().solve(N));
		}
	}

	public int solve(int A) {
		int count = 0;
		while (true) {
			if ((A & (1 << 0)) == 0) {
				count++;
				A = (A >> 1);
			} else {
				break;
			}
		}
		return count;
	}
}
