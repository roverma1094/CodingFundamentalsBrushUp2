package codechef;

import java.util.Scanner;


public class Vaccine {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNextLine()) {
			String input=scanner.nextLine();
			String[] inputArray=getInputArray(input);
			int minDayForVaccine=minDaysForProduction(inputArray);
			if (minDayForVaccine!=-1) {
				System.out.println(minDayForVaccine);	
			}
		}
		scanner.close();
	}

	/**
	 * No of days required to produces vaccines
	 * @param inputArray
	 * @return
	 */
	private static int minDaysForProduction(String[] inputArray) {
		//d1 and d2 : Days on which two companies will start their production
		//v1 and v2 : Number of vaccine produced per day by either company
		//P : total vaccines needed 
		int d1=Integer.parseInt(inputArray[0]);
		int v1=Integer.parseInt(inputArray[1]);
		int d2=Integer.parseInt(inputArray[2]);
		int v2=Integer.parseInt(inputArray[3]);
		int p=Integer.parseInt(inputArray[4]);
		
		if(isValid(d1,v1,d2,v2,p)) {
			int totalVaccineProduced=0;
			int productionDay=0;
			while(totalVaccineProduced<p) {
				productionDay++;
				totalVaccineProduced+=productionPerDay(d1,v1,d2,v2,productionDay);
			}
			return productionDay;
		}
		return -1;
	}
	
	/**
	 * Per Day Production Calculation
	 */
	private static int productionPerDay(int d1, int v1, int d2, int v2, int productionDay) {
		int perDayProduction=0;
		if(d1<=productionDay)
			perDayProduction+=v1;
		if(d2<=productionDay)
			perDayProduction+=v2;
		return perDayProduction;
	}

	/**
	 * Validate According to given Constraint
	 * @param d1
	 * @param v1
	 * @param d2
	 * @param v2
	 * @param p
	 * @return
	 */
	private static boolean isValid(int d1, int v1, int d2, int v2, int p) {
		if((d1>=1)&&(d1<=100)&&(d2>=1)&&(d2<=100)&&(v1>=1)&&(v1<=100)&&(v2>=1)&&(v2<=100)&&(p>=1)&&(p<=1000))
			return true;
		return false;
	}

	/**
	 * Return Array by seperating " "
	 * @param input
	 * @return
	 */
	private static String[] getInputArray(String input) {
		String[] inputArray=new String[5];
		inputArray=input.split(" ");
		return inputArray;
	}
}
