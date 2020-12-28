package hackerrank.smartinterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.text.Element;

/** Approach 1 : Without using any libraries
 * a. Get all elements in array for n
 * b. Check whether element repeated itself in complete array > 1
 * c. Store it in other array and check if its already exist
 * d. Print array
 */

/**
 * Approach 2 : Using existing libraries
 * a. Get all elements in array of size n
 * b. Check whehther elements repeats itself >1 break
 * c. Use Set for unique value 
 * d. Print set value
 */
public class DuplicateElementInArray {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int n=fastReader.nextInt();
		int[] inputArray=new int[n];
		int i=0;
		if(n>=2&&n<=100) {
			while(n!=0) {
				inputArray[i]=fastReader.nextInt();
				n--;
				i++;
			}
		}
		printDuplicateArray(inputArray);
	}

	private static void printDuplicateArray(int[] inputArray) {
		ArrayList<Integer> duplicateElements=new ArrayList<Integer>();
		StringBuilder builder=new StringBuilder();
		for (int element : inputArray) {
			int count=0;
			for (int i = 0; i < inputArray.length; i++) {
				if(element==inputArray[i]) {
					count++;
				}
				if(count>1) {
					if(!duplicateElements.contains(element)) {
						duplicateElements.add(element);
						builder.append(element).append(" ");
					}
					break;
				}
			}
				
		}
		System.out.println(builder.toString().trim());
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
