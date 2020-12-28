package vjudge.part_two;

import java.util.ArrayList;
import java.util.Scanner;

public class GravityFlip {
	int n;
	ArrayList<Integer> intArray=new ArrayList<Integer>();
	public GravityFlip() {
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNextInt())
			n=scanner.nextInt();

		int[] cubesPerColumn=new int[n];
		if(scanner.hasNextLine()) {
			int i=0;
			while(i<n) {
				cubesPerColumn[i]=scanner.nextInt();
				intArray.add(cubesPerColumn[i]);
				i++;
			}
		}
		flipGravity(cubesPerColumn);
		scanner.close();
			
	}
	
	private void flipGravity(int[] cubesPerColumn) {
		sortArrayUsingQuickSort(cubesPerColumn);
	}
	
	private void sortArrayUsingQuickSort(int[] cubesPerColumn) {
		int lowerPosition=0;
		int higherPosition=cubesPerColumn.length;
		int lastLowPosition=processArrayData(cubesPerColumn,lowerPosition,higherPosition-1);
		if(lowerPosition<=lastLowPosition-1) {
			processArrayData(cubesPerColumn,lowerPosition,lastLowPosition-1);
		}
		if(lowerPosition<=lastLowPosition-1) {
			processArrayData(cubesPerColumn,lowerPosition,lastLowPosition-1);
		}
		if(lastLowPosition>higherPosition) {
			processArrayData(cubesPerColumn,lastLowPosition,lastLowPosition-1);
		}
		StringBuilder builder=new StringBuilder();
		for (int value : cubesPerColumn) {
			builder.append(value).append(" ");
		}
		System.out.println(builder.toString().trim());
	}
	
	private int processArrayData(int[] cubesPerColumn,int lowerPosition,int higherPosition) {
		int pivot=cubesPerColumn[(lowerPosition+higherPosition)/2];
		while(lowerPosition<higherPosition) {
			while(cubesPerColumn[lowerPosition]<pivot) {
				lowerPosition++;
			}
			while(cubesPerColumn[higherPosition]>pivot) {
				higherPosition--;
			}
			if(lowerPosition<=higherPosition) {
				int temp=cubesPerColumn[lowerPosition];
				cubesPerColumn[lowerPosition]=cubesPerColumn[higherPosition];
				cubesPerColumn[higherPosition]=temp;
				lowerPosition++;
				higherPosition--;
			}
		}
		return lowerPosition;
	}
	
	public static void main(String[] args) {
		new GravityFlip();
	}
}
