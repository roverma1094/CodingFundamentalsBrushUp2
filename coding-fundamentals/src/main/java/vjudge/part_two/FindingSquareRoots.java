package vjudge.part_two;

import java.util.Scanner;


public class FindingSquareRoots {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//Number of testcases
		int t=0;
		if(scanner.hasNextInt())
			t=scanner.nextInt();
		if(t>=1 && t<=20) {
			for (int i = 0; i < t; i++) {
				if(scanner.hasNextInt()) {
					//Input for which square roots needs to taken out
					int n=scanner.nextInt();
					if(n>=1&&n<=10000) {
						int nSqrt=(int) Math.round((Math.sqrt(n)));
						System.out.println(nSqrt);
					}
				}
			}
		}
		
		scanner.close();
	}
}
