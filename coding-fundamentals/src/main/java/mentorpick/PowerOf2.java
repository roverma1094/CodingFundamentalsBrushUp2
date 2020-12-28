package mentorpick;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(new PowerOf2().isPowerOfEight(n));
	}

	boolean isPowerOfEight(int n) {
		if (n != 0) {
			if ((n & (n - 1)) == 0) {
				int zeroCount=0;
				while(n!=1) {
					n=(n>>1);
					zeroCount++;
				}
				if(zeroCount%3==0) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
}
