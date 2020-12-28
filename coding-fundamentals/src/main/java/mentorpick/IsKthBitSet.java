package mentorpick;

import java.util.Scanner;

public class IsKthBitSet {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long n=scanner.nextLong();
		int k=scanner.nextInt();
		System.out.println(IsKthBitSet1(n,k));
		
	}
	private static boolean IsKthBitSet1(long N, int K) {
		return ((N&(1l<<K))==(1l<<K))?true:false;
	}
}
