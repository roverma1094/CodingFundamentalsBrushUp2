package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TC : T(q) i.e O(q) 
//SC : 7 i.e O(1)
public class LiftRequest {
	public static void main(String[] args) {
		FastReader fastReader = new FastReader();
		int t = fastReader.nextInt();// test cases
		while (t > 0) {
			int n = fastReader.nextInt();// Number of floors
			int q = fastReader.nextInt();// Number of request
			long totalFloorTravelled = 0;
			int liftPosition = 0;
			while (q > 0) { //q
				int requestSource = fastReader.nextInt();
				int requestDestionation = fastReader.nextInt();
				if(requestSource<=n&&requestDestionation<=n) {
					totalFloorTravelled += Math.abs(liftPosition - requestSource)+ Math.abs(requestDestionation-requestSource);
					liftPosition = requestDestionation;
				}
				q--;
			}
			System.out.println(totalFloorTravelled);
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
