package interviewbit;

import java.util.Scanner;

public class CountTotalSetBits {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int A = sc.nextInt();
		System.out.println(new CountTotalSetBits().solve(A));
	}

	public int solve(int A) {
		int totalCount = 0;
		for (int i = 1; i <= A; i++) {
			int individualCount = 0;
			int individualNumber=i;
			while (individualNumber > 0) {
				individualNumber = individualNumber & (individualNumber - 1);
				individualCount++;
			}
			totalCount+=individualCount;
		}
		return (totalCount%1000000007);
	}
}
