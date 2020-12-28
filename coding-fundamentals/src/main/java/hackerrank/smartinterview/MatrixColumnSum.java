package hackerrank.smartinterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * Approach:
 * a. Define matrix[row][1] } Will treat each row as [n][1] matrices
 * b. Therefore number of matrices will be equal to N 
 * c. If N==0 then will fill [n][1] matrices and for n!=0 [n][1]+=[n][1]
 */
public class MatrixColumnSum {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int rows=fastReader.nextInt();
		int columns=fastReader.nextInt();
		int[][] matrix=new int[1][columns];
		for (int m = 0; m < rows/*Treating it as number of matrix*/; m++) { 
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < columns; j++) {
					if(m==0)
						matrix[i][j]=fastReader.nextInt();
					else
						matrix[i][j]+=fastReader.nextInt();
				}
			}
		}
		printMatrices(matrix);
	}
	
	private static void printMatrices(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
