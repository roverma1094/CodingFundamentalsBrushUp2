package hackerrank.smartinterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * Approach : 
 * a. Store row and column values
 * b. Will use int[] for matrix since size of int is 4bytes i.e 32 bits so Min and Max Signed value is -2^(32-1) and +2(^32-1)-1
 * 	i.e 2^10=10^3 therefore 4*2^30=4*10^9(Approx) 
 * c. Given matrix n*m will store values in m*n
 * i.e iterate over column and then row inside
 */
public class TransposeMatrix {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int row=fastReader.nextInt();
		int column=fastReader.nextInt();
		int[][] matrixTranspose=new int[column][row];
		for (int i = 0; i < row && row<=100; i++) {
			for (int j = 0; j < column && column<=100; j++) {
				matrixTranspose[j][i]=fastReader.nextInt();
			}
		}
		printMatrices(matrixTranspose);
	}
	
	private static void printMatrices(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			StringBuilder builder=new StringBuilder();
			for (int j = 0; j < matrix[i].length; j++) {
				builder.append(matrix[i][j]).append(" ");
			}
			System.out.println(builder.toString().trim());
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
