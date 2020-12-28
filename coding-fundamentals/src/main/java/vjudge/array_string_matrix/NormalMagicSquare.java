package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * TC : 0 i.e O(1) and SC: 1 i.e O(1)
 * Approach :
 * 	a. Take n value
 * 	b. Use Magic Constant Formula : n(n^2+1)/2
 */
public class NormalMagicSquare {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int n=fastReader.nextInt();
		if(n>=1&&n<=1000&&n!=2) {
			System.out.println(n*((n*n)+1)/2);
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
