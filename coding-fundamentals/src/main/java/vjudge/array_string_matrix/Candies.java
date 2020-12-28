package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Candies {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int t=fastReader.nextInt();
		while(t>0) {
			int n=fastReader.nextInt();
			int x=0;
			for(int k=2;k<=35;k++) {
				int den=(int) (Math.pow(2, k)-1);
				if(n%den!=0) {
					continue;
				}
				x=n/den;
				break;
			}
			System.out.println(x);
			t--;
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
