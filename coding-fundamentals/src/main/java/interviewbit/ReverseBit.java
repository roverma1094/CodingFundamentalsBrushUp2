package interviewbit;

import java.util.Scanner;

public class ReverseBit {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int A = sc.nextInt();
		System.out.println(new ReverseBit().reverse(A));
	}


	public long reverse(long a) {
		long reverseData=0;
		for (int i = 32; i >0; i--) {
			if((a&(1<<0))==1) {
				reverseData=reverseData|(1l<<(i-1));
			}
			a=(a>>1);
		}
		return reverseData;
	}
}
