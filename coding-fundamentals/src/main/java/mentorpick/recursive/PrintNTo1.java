package mentorpick.recursive;

import java.util.Scanner;

public class PrintNTo1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			new PrintNTo1().printNToOne(N);
		}
	}
	
	void printNToOne(int N)
	{
		if(N>0) {
			System.out.print(N+" ");
			printNToOne(N-1);
		}
	}
}
