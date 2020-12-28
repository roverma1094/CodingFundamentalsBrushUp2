package mentorpick;

import java.util.Scanner;

public class CountSetBits {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		while (sc.hasNext()) {
			long N = sc.nextLong();
			int count=0;
			while(N!=0) {
				N=N&(N-1);
				count++;
			}
			System.out.println(count);
		}
	}
}
