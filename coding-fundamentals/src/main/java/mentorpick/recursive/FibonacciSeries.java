package mentorpick.recursive;

import java.util.Scanner;

public class FibonacciSeries {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			System.out.println(new FibonacciSeries().fibonacci(N));
		}
	}
	
	long fibonacci(int n){
		if(n==1)
			return 1;
		if(n==0)
			return 0;
		return (fibonacci(n-1)+fibonacci(n-2));
	}
}
