package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class VaccineDistribution {
	/*
	 * T: Total Test Cases
	 * N: Total Number of People
	 * D: Number of people vaccinated per day
	 * Condition : age>=80 or 9<= : High Risk
	 * a : age group of people
	 * minDay : Minimum Day people will get vaccinated
	 */
	int t,n,minDay;
	double d;
	String[] a;
	int[] output;
	private final int minAge=9,maxAge=80;
	
	public VaccineDistribution() {
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		t=Integer.parseInt(input);
		output=new int[t];
		for (int j = 0; j < t; j++) {
			int i=1;
			input=scanner.nextLine();
			second : while(!input.isEmpty()) {
				if(i==1) {
					String[] secondLineArray=input.split(" ");
					n=Integer.parseInt(secondLineArray[0]);
					d=Integer.parseInt(secondLineArray[1]);
					input=scanner.nextLine();
				}else if(i==2) {
					a=input.split(" ");
					break second;
				}
				i++;
			}
			output[j]=calculateMinimumDay(t,n,d,a);
		}
		
		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j]);
		}
		
		scanner.close();
	}
	
	private int calculateMinimumDay(int t, int n, double d, String[] a) {
			ArrayList<Integer> highRiskPeople=new ArrayList<Integer>();
			ArrayList<Integer> nonHighRiskPeople=new ArrayList<Integer>();
			if(d==1)
				return a.length;
			else {
				for (int j = 0; j < a.length; j++) {
					int age=Integer.parseInt(a[j]);
					if(age>=maxAge || age<=minAge) {
						highRiskPeople.add(age);
					}else {
						nonHighRiskPeople.add(age);
					}
				}
				int days=(int) (Math.ceil(highRiskPeople.size()/d)+Math.ceil(nonHighRiskPeople.size()/d));
				return days;
			}
	}


	public static void main(String[] args) {
		new VaccineDistribution();
	}
}
