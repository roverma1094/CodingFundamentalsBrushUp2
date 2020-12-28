package vjudge.part_three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/**
 * Approach :
 * a. Take row and column variable
 * b. Given matrix NxM with rotate 90degree and become MxN
 * c. Fill matrix by below method and define matrix as [col][row]
 * 		i. Loop 1: Will start from  row till 0
 * 		ii. Loop 1 : will start from 0 to col 
 * 		iii. Fill Matrix [i,j] so here what will happen
 * 		Lets say we have 3*2 matrix therefore 90 degree rotation will be 2*3
 
 */
public class Rotation {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int row=fastReader.nextInt();
		int col=fastReader.nextInt();
		int[][] ninty_degree_matrix = new int[col][row];

		for (int j = row-1; j >= 0; j--) {
			for (int i = 0; i < col; i++) {
				ninty_degree_matrix[i][j] = fastReader.nextInt();
			}
		}
		try {
			printNintyDegreeMatrix(ninty_degree_matrix);

		}catch (Exception e) {

		}

	}

	private static void printNintyDegreeMatrix(int[][] ninty_degree_matrix) throws Exception{
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
		writer.append(ninty_degree_matrix.length+" ").append(ninty_degree_matrix[0].length+"\n");
		for (int i = 0; i < ninty_degree_matrix.length; i++) {
			StringBuilder builder=new StringBuilder();
			for (int j = 0; j < ninty_degree_matrix[i].length; j++) {
				builder.append(ninty_degree_matrix[i][j]).append(" ");
			}
			writer.write(builder.toString().trim()+"\n");
		}
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
