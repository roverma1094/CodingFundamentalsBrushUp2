package codechef;

import java.util.Scanner;

public class IntegerPair {
	//T : No of test cases
	int t=0,a=0,b=0;

	public IntegerPair() {
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNextInt())
			t=scanner.nextInt();
		int i=0;
		while( i < t) {
			if(scanner.hasNextLine()) {
				String input=scanner.nextLine();
				if(!input.isEmpty()) {
				String[] integerValue=input.split("  ");
				a=Integer.parseInt(integerValue[0]);
				b=Integer.parseInt(integerValue[1]);
				int pairs=calculatePairOfInteger(a,b);
				System.out.println(pairs);
				i++;
				}
			}
			
		}
		scanner.close();
	}
	
	/**
	 * Calculate Pair Of Integer 
	 * Addition of Number should be integer
	 * @param a
	 * @param b
	 * @return
	 */
	private int calculatePairOfInteger(int a, int b) {
		int numberOfPair=0;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if((i+j)%2==0) {
					numberOfPair++;
				}
			}
		}
		return numberOfPair;
	}

	public static void main(String[] args) {
		new IntegerPair();
	}
}
