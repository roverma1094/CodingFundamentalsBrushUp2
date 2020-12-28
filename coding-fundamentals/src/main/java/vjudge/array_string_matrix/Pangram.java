package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pangram {
	public static void main(String[] args) {
		char[] characters= "abcdefghijklmnopqrstuvwxyz".toCharArray();
		FastReader scanner=new FastReader();
		int numberOfCharacters=scanner.nextInt();
		String input=scanner.nextLine().toLowerCase();
		//total characters is 27
		String value="YES";
		if(numberOfCharacters<characters.length) {
			value="NO";
		}else {
			char[] inputChar=input.toCharArray();
			for (int i = 0; i < characters.length; i++) {
				boolean matched=false;
				for (int j = 0; j < inputChar.length; j++) {
					if(characters[i]==inputChar[j]) {
						matched=true;
						break;
					}
				}
				if(!matched) {
					value="NO";
					break;
				}
			}	
		}
		System.out.println(value);
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
