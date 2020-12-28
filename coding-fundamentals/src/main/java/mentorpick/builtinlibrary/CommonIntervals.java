package mentorpick.builtinlibrary;

import java.util.Scanner;

public class CommonIntervals {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			int s1=sc.nextInt();
			int e1=sc.nextInt();
			int s2=sc.nextInt();
			int e2=sc.nextInt();
			
			if((s2>=e1)||(e2<=s1)) {
				System.out.println(-1+" "+-1);
			}else {
				System.out.println(Math.max(s2, s1)+" "+Math.min(e2, e1));
			}
		}
	}
}
