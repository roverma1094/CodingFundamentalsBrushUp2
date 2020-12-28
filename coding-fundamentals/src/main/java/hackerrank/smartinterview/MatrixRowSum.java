package hackerrank.smartinterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * Approach :
 *	a. Take row and column
 *	b. Loop of row and within it for columns times
 *	c. Add all row values i.e iteration of j values
 */
public class MatrixRowSum {

	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int row=fastReader.nextInt();
		int column=fastReader.nextInt();
		for (int i = 0; i < row; i++) {
			int output = 0;
			for (int j = 0; j < column; j++) {
				output+=fastReader.nextInt();
			}
			System.out.println(output);
		}
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
