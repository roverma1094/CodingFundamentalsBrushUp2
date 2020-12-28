package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BalancedArray {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int t=fastReader.nextInt();
		while(t>0) {
			int n=fastReader.nextInt();
			//For Filling even
			int sumOfEven=0;
			int sumOfOdd=0;
			int[] arr=new int[n];
			int k=2;
			for (int i = 0; i < n/2; i++) {
				arr[i]=k;
				sumOfEven+=k;
				k+=2;
			}
			k=1;
			String value="";
			for (int i = n/2; i < n; ) {
				if(i<(n-1)){
					arr[i]=k;
					sumOfOdd+=k;
					i++;
				}
				if(i==(n-1)) {
					sumOfOdd+=k;
					if(sumOfOdd==sumOfEven) {
						value="YES";
						arr[i]=k;
						break;
					}
					if(sumOfOdd>sumOfEven) {
						value="NO";
						break;
					}
					sumOfOdd-=k;
				}
				k+=2;
			}
			if(value.equals("YES")) {
				System.out.println(value);
				StringBuilder builder=new StringBuilder();
				for (int i = 0; i < arr.length; i++) {
					builder.append(arr[i]).append(" ");
				}
				System.out.println(builder.toString().trim());
			}else {
				System.out.println(value);
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
	}

}
