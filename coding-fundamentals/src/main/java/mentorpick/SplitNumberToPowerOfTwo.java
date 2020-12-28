package mentorpick;

import java.util.Scanner;

public class SplitNumberToPowerOfTwo {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		while(t>0) {
			long n=scanner.nextLong();
			int[] binaryArray=new int[64];
			convertToBinary(binaryArray,n);
			printIn2Power(binaryArray);
			t--;
		}
		scanner.close();
	}

	private static void printIn2Power(int[] binaryArray) {
		StringBuilder builder=new StringBuilder();
		for (int i = binaryArray.length-1; i >= 0; i--) {
			if(binaryArray[i]==1) {
				builder.append((long)Math.pow(2, i)).append(" ");
			}
		}
		System.out.println(builder.toString().trim());
	}

	private static void convertToBinary(int[] binaryArray, long n) {
		for (int i = 0; i < binaryArray.length; i++) {
			binaryArray[i]=(int) (n%2);
			n=n/2;
		}
	}
	
}
