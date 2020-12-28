package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CacheHits {
	public static void main(String[] args) {
		FastReader fastReader = new FastReader();
		int t = fastReader.nextInt();
		while (t > 0) {
			int n = fastReader.nextInt();
			int b = fastReader.nextInt();
			int m = fastReader.nextInt();
			int[] arrm = new int[m];
			for (int i = 0; i < m; i++) {
				arrm[i] = fastReader.nextInt();
			}
			int[][] blockMatrix = new int[(int) Math.ceil((double) n / (double) b)][b];
			int value = 0;
			// Loading Blocks
			for (int i = 0; i < blockMatrix.length; i++) {
				for (int j = 0; j < b; j++) {
					if (value < n) {
						blockMatrix[i][j] = value;
						value++;
					} else {
						blockMatrix[i][j] = -1;
					}
				}

			}
			// For each element
			// 1.Check value present in cache//For first time cache is empty
			// 2.Traverse Matrix and match the value
			// 3.If matched then load that row value to cache and increase cache loaded
			System.out.println(cacheLoadedFor(blockMatrix, arrm, b));
			t--;
		}
	}

	private static int cacheLoadedFor(int[][] blockMatrix, int[] arrm, int b) {
		int[] cacheArr = new int[b];
		int cacheLoadCount = 0;
		for (int i = 0; i < arrm.length; i++) {
			if (i != 0) {
				if (!checkValuePresentInCache(arrm[i], cacheArr)) {
					cacheLoadCount++;
					loadCacheAndCheck(cacheArr, blockMatrix, arrm[i]);
				}
			} else {
				cacheLoadCount++;
				loadCacheAndCheck(cacheArr, blockMatrix, arrm[i]);
			}
		}
		return cacheLoadCount;
	}

	private static void loadCacheAndCheck(int[] cacheArr, int[][] blockMatrix, int arrm) {
		outerloop: for (int i = 0; i < blockMatrix.length; i++) {
			for (int j = 0; j < blockMatrix[i].length; j++) {
				if (arrm == blockMatrix[i][j]) {
					loadCache(cacheArr, i, blockMatrix, blockMatrix[i].length);
					break outerloop;
				}
			}
		}
	}

	private static void loadCache(int[] cacheArr, int i, int[][] blockMatrix, int b) {
		for (int j = 0; j < b; j++) {
			cacheArr[j] = blockMatrix[i][j];
		}
	}

	private static boolean checkValuePresentInCache(int i, int[] cacheArr) {
		for (int j : cacheArr) {
			if (i == j) {
				return true;
			}
		}
		return false;
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
