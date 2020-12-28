package mentorpick;

import java.util.Scanner;

public class Subset {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		while(t>0) {
			int n=scanner.nextInt();
			int sum=scanner.nextInt();
			int[] array=new int[n];
			for (int i = 0; i < n; i++) {
				array[i]=scanner.nextInt();
			}
			String value="NO";
			for (int i = 1; i < (1l<<n); i++) {
				int subSetSum=0;
				for (int j = 0; j < n; j++) {
					if(isKthBitSet(i,j)) {
						subSetSum+=array[j];
					}
				}
				if(subSetSum==sum) {
					value="YES";
					break;
				}
			}
			System.out.println(value);
			t--;
		}
	}

	private static boolean isKthBitSet(int i, int j) {
		return (i&(1<<j))!=0;
	}
}
