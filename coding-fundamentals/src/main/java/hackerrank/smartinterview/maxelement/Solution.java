package hackerrank.smartinterview.maxelement;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		FastReader fastReader = new FastReader();
		int n = fastReader.nextInt();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		long maxValue = Integer.MIN_VALUE;
		if (n > 0) {
			while (n != 0 && n <= 1000) {
				long value = fastReader.nextLong();				
				if (value > maxValue) {
					maxValue = value;
				}
				n--;
			}
			bufferedWriter.write(String.valueOf(maxValue));
		}
		bufferedWriter.close();
		
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