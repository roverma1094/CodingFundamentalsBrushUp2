package vjudge.part_three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Half {
	public static void main(String[] args) throws Exception {
		FastReader fastReader = new FastReader();
		int row = fastReader.nextInt();
		int secondaryDiagonalPosition = row;
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < row; i++) {
			boolean secondaryDiagonalFound = false;
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < row; j++) {
				if (j == (secondaryDiagonalPosition - 1)) {
					builder.append(0);
					secondaryDiagonalFound = true;
					secondaryDiagonalPosition--;
				} else {
					if (secondaryDiagonalFound) {
						builder.append(1);
					} else {
						builder.append(2);
					}
				}

			}
			writer.write(builder.toString()+"\n");

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
