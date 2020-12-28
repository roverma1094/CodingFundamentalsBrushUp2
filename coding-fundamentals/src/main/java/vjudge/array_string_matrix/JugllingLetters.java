package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//TC: 
public class JugllingLetters {
	public static void main(String[] args) {
		FastReader fastReader = new FastReader();
		int tc=fastReader.nextInt();
		while (tc>0) {//T
			int n=fastReader.nextInt();
			StringBuilder builder=new StringBuilder();
			for (int i = 0; i < n; i++) {//n
				builder.append(fastReader.nextLine());
			}
			String result="YES";
			HashMap<Character, Integer> characterCount=new HashMap<Character, Integer>();
			char[] inputChar=builder.toString().toCharArray();
			for (int i = 0; i < inputChar.length; i++) {//Character Lengths
				int charCount=0;
				for (int j = i; j < inputChar.length; j++) {
					if(!characterCount.containsKey(inputChar[i])) {
						if(inputChar[i]==inputChar[j])
							charCount++;
					}else {
						charCount=characterCount.get(inputChar[i]);
						break;
					}
				}
				characterCount.put(inputChar[i], charCount);
				if(!(charCount%n==0)) {
					result="NO";
					break;
				}
			}
			System.out.println(result);
			tc--;
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
