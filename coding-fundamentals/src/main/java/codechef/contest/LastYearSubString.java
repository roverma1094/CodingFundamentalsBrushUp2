package codechef.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LastYearSubString {
	public static void main(String[] args) {
		FastReader fastReader = new FastReader();
		int t = fastReader.nextInt();
		while (t > 0 && t <= 1000) {
			int n = fastReader.nextInt();
			if(n>4 && n <= 200) {
				String s = fastReader.nextLine();
				String value = "";
				for (int j = 0; j < n; j++) {
					boolean matched=false;
					for (int j2 = n-1; j2 >=0&&j2>=j; j2--) {
						String replaceAble=s.substring(j,j2);
						String data=s;
						if(data.replace(replaceAble,"").equalsIgnoreCase("2020")) {
							value="YES";
							matched=true;
							break;
						}
					}
					if (matched) {
						break;
					}
				}
				if (value.isEmpty()) {
					System.out.println("NO");
				} else {
					System.out.println(value);
				}
			}else if(n==4) {
				String s = fastReader.nextLine();
				if(s.equalsIgnoreCase("2020")) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
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
