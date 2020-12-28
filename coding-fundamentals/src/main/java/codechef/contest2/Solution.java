package codechef.contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int t=fastReader.nextInt();
		while(t>0) {
			String value="NO";
			int shotRound=1;
			int a=fastReader.nextInt();
			int b=fastReader.nextInt();
			int c=fastReader.nextInt();
			boolean aMOd=false;
			boolean bMOd=false;
			boolean cMOd=false;
			
			if(a%3==0) {
				aMOd=true;
			}else if(b%3==0) {
				bMOd=true;
			}else if(c%3==0) {
				cMOd=true;
			}
			
			if(a%3==0) {
				aMOd=true;
			}else if(b%3==0) {
				bMOd=true;
			}else if(c%3==0) {
				cMOd=true;
			}
			
			if(a%2==0&&!aMOd) {
				aMOd=true;
			}else if(b%2==0&&!bMOd) {
				bMOd=true;
			}else if(c%2==0&&!cMOd) {
				cMOd=true;
			}
			

			if(a%4==0&&!aMOd) {
				aMOd=true;
			}else if(b%4==0&&!bMOd) {
				bMOd=true;
			}else if(c%4==0&&!cMOd) {
				cMOd=true;
			}
			
			if(aMOd&&bMOd&&cMOd) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
//			while(true) {
//				if(shotRound%7==0) {
//					a--;
//					b--;
//					c--;
//				}else {
//					if(a>b||a>c) {
//						a--;
//					}else if(b>a||b>c){
//						b--;
//					}else if(c>a||c>b){
//						c--;
//					}else if(a==b&&b==c&&c==a&&a>0) {
//						a--;
//					}
//				}
//				if((a==0||b==0||c==0)&&(a>0||b>0||c>0)) {
//					value="NO";
//					break;
//				}
//				if(a==b&&b==c&&a==0) {
//					value="YES";
//					break;
//				}
//				shotRound++;
//			}
//			System.out.println(value);
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
