package hackerrank.smartinterview.reversearray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1 <= N <= 100
 *	0 <= ar[i] <= 10^18
 * @author rover
 *
 */
public class Solution {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		//Max 100
		int n=fastReader.nextInt();
		if(n>0&&n<=100) {
			long[] inputArray=new long[n];
			for (int i = n; i > 0; i--) {
				inputArray[i-1]=fastReader.nextLong();
			}
			printReverseArray(inputArray);
		}
		
	}

	private static void printReverseArray(long[] inputArray) {
		StringBuilder builder=new StringBuilder();
		for (long value : inputArray) {
			if(value>=0) {
				builder.append(value).append(" ");
			}
		}
		System.out.println(builder.toString().trim());
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
