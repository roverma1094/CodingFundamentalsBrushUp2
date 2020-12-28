package interviewbit.test;

import java.util.ArrayList;

public class DigonallyPowerfullMatrix {
	public static void main(String[] args) {
		int[][] A={{2,2,1},{10,4,1},{11,3,2}};
		System.out.println(new DigonallyPowerfullMatrix().solve(A));
	}

	public int solve(int[][] A) {
		ArrayList<Integer> pdigonalElements=new ArrayList<Integer>();
		ArrayList<Integer> sdigonalElements=new ArrayList<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if(i==j) {
					pdigonalElements.add(A[i][j]);
				}
				if((i+j)==(A[i].length)) {
					sdigonalElements.add(A[i][j]);
				}
			}
		}
		
		for (Integer integer : sdigonalElements) {
			
		}
		for (Integer integer : pdigonalElements) {
			
		}
		return 0;
	}
}
