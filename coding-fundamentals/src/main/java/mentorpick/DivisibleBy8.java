package mentorpick;

import java.util.Scanner;

public class DivisibleBy8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(new DivisibleBy8().isDivisibleBy8(n));
	}

	boolean isDivisibleBy8(int n) {
		int mask=(1<<0)|(1<<1)|(1<<2);
		if((n&mask)==0) {
			return true;
		}else {
			return false;
		}
	}
}
