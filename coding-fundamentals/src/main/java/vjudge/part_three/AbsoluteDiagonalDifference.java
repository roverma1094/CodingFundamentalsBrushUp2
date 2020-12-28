package vjudge.part_three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AbsoluteDiagonalDifference {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int row=fastReader.nextInt();
		int column=row;
		int[][] matrix=new int[row][column];
		int primaryDiagonal=0,secondaryDiagonal=0;
		int secondaryDiagonalPosition=matrix.length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int element=fastReader.nextInt();
				if(i==j) {
					primaryDiagonal+=element;
				}
				if(j==(secondaryDiagonalPosition-1)){
					secondaryDiagonalPosition--;
					secondaryDiagonal+=element;
				}
			}
		}
		System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));
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
