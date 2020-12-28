package codechef.contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CatchTheTheif {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int t=fastReader.nextInt();
		while (t>0) {
			int x=fastReader.nextInt();
			int y=fastReader.nextInt();
			int k=fastReader.nextInt();
			int n=fastReader.nextInt();
			
			int median=(x+y)/2;
			if((Math.abs(median-x)%k==0)&&(Math.abs(median-y)%k==0)&&median!=0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
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
	}}
