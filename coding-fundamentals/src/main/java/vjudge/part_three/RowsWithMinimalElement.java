package vjudge.part_three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * Approach :
 * 	a. Row and Column to be defined
 * 	b. Filling matrix and check for minimum number
 * 	c. While printing will check if that element belongs to any any if found then break inner loop
 */
public class RowsWithMinimalElement {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int row=fastReader.nextInt();
		int col=fastReader.nextInt();
		int[][] matrix=new int[row][col];
		int minimumValue=Integer.MAX_VALUE;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j]=fastReader.nextInt();
				if(minimumValue>matrix[i][j]) {
					minimumValue=matrix[i][j];
				}
			}
		}
		try {
			printRowsContainingMinValue(minimumValue,matrix);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

	private static void printRowsContainingMinValue(int minimumValue, int[][] matrix) throws Exception {
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder=new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (minimumValue==matrix[i][j]) {
					builder.append(i+1).append(" ");
					break;
				}
			}
		}
		writer.write(builder.toString());
		writer.close();
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
