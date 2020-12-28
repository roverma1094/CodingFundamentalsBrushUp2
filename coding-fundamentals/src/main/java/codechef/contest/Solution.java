package codechef.contest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception{
		FastReader fastReader=new FastReader();
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=fastReader.nextInt();
		while (t>0&&t<=300) {
			int n=fastReader.nextInt();
			long[] arr=new long[n];
			for (int i = 0; i < n&&n<=300; i++) {
				arr[i]=fastReader.nextLong();
			}
			writer.write((printPolyCarpArray(arr,n))+"\n");
			t--;
		}
		writer.close();
	}
	
	private static String printPolyCarpArray(long[] arr, int n) throws Exception{
		StringBuilder builder=new StringBuilder();
		int i=0;
		int j=n-1;
		while (i<j) {
				builder.append(arr[i]).append(" ").append(arr[j]).append(" ");
				i++;
				j--;
		}
		if(n%2!=0) {
			builder.append(arr[i]);
		}
		
		return builder.toString().trim();
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
