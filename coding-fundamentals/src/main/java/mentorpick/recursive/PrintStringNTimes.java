package mentorpick.recursive;

import java.util.Scanner;

public class PrintStringNTimes {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			String s=sc.nextLine();
			new PrintStringNTimes().printStringNTimes(s,N);
		}
	}
	void printStringNTimes(String s, int N) {
		if(N>0) {
			System.out.print(s+" ");
			N--;
			printStringNTimes(s,N);
		}
	}
}
