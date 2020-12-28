package hackerrank.smartinterview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Approach 1: Given 2 matrices , a. Will capture value of N-no of rows and
 * M-number of columns b. Loop for 2 times to fill matrices of NxM c. When
 * Filling first time, will wont add previous values else will add previous
 * value to it
 *
 */
public class AdditionOfMatrix {

	public static void main(String[] args) {
		FastReader scanner = new FastReader();
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		int[][] output = new int[rows][columns];
		for (int m = 0; m < 2/* No of matrices */; m++) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (m == 0) {
						output[i][j] = scanner.nextInt();
					} else {
						output[i][j] = output[i][j] + scanner.nextInt();
					}
				}
			}
		}
		printOutput(output);

	}

	private static void printOutput(int[][] output) {
		for (int i = 0; i < output.length; i++) {
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < output[i].length; j++) {
				builder.append(output[i][j]).append(" ");
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
