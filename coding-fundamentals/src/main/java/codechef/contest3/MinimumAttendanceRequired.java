package codechef.contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumAttendanceRequired {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int testCases=fastReader.nextInt();
		while(testCases>0) {
			int n=fastReader.nextInt();
			int remainingDays=120-n;
			char[] input=fastReader.nextLine().toCharArray();
			int daysPresent=0;
			for (int i = 0; i < input.length; i++) {
				if (input[i]=='1') {
					daysPresent++;
				}
			}
			if((daysPresent+remainingDays)>=90) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			testCases--;
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
