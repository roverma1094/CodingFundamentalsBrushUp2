package mentorpick.recursive;

import java.util.Scanner;

public class FindingArrayIndex {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (sc.hasNext()) {
			int arrayLength = sc.nextInt();
			int[] array=new int[arrayLength];
			for (int i = 0; i < array.length; i++) {
				array[i]=sc.nextInt();
			}
			int kArrayLength=sc.nextInt();
			int[] kArray=new int[kArrayLength];
			for (int i = 0; i < kArray.length; i++) {
				System.out.println(new FindingArrayIndex().findingIdx(array, sc.nextInt()));
			}
		}
	}

	int findingIdx(int a[], int k) {
		return findIndex(a,0,k);
	}

	private int findIndex(int[] a, int index, int k) {
		if(a.length==index){
			return -1;
		}
		if(a[index]==k) {
			return index;
		}
		return findIndex(a, (index+1), k);
	}
}
