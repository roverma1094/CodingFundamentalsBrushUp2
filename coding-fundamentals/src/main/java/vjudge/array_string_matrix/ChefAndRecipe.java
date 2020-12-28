package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//TC : T(N+2(N^2)) --> O(N^2)
//SC : 11 O(1)
public class ChefAndRecipe {
	public static void main(String[] args) {
		FastReader fastReader=new FastReader();
		int t=fastReader.nextInt();
		while(t>0) {
			int n=fastReader.nextInt();
			int[] recipe=new int[n];
			int[] chefJar=new int[n];
			int chefJarPosition=0;
			int[] ingredientUsedTime=new int[n];
			int ingredientUsedTimePosition=0;
			int ingrediantUsedCount=0;
			int previousIngrediantUsed=0;
			String chefsRecipe="YES";
			//n-times
			for (int i = 0; i < n; i++) {
				recipe[i]=fastReader.nextInt();
			}
			//n*n=n^2-times
			//Checking whether ingredient is not repeated in the same recipe after ingredient contagious sequence
			for (int i = 0; i < recipe.length; i++) {//n time
				if(chefAlreadyUsedIngredient(chefJar,recipe[i])) {//n time
					chefsRecipe="NO";
					break;
				}else {
					if(previousIngrediantUsed==recipe[i]) {
						ingrediantUsedCount++;
					}else {
						if(ingrediantUsedCount!=0) {
							ingredientUsedTime[ingredientUsedTimePosition]=ingrediantUsedCount;
							ingrediantUsedCount=0;
							ingredientUsedTimePosition++;
						}
						ingrediantUsedCount++;
						if(previousIngrediantUsed!=0) {
							chefJar[chefJarPosition]=previousIngrediantUsed;
							previousIngrediantUsed=0;
							chefJarPosition++;
						}
						previousIngrediantUsed=recipe[i];
					}
					if(i==n-1) {
						if(ingrediantUsedCount!=0) {
							ingredientUsedTime[ingredientUsedTimePosition]=ingrediantUsedCount;
							ingredientUsedTimePosition++;
						}
						if(previousIngrediantUsed!=0) {
							chefJar[chefJarPosition]=previousIngrediantUsed;
							chefJarPosition++;
						}
					}
				}
			}
			//n^2
			//Checking if ingrediant was used for different time.
			outerloop: for (int i = 0; i < ingredientUsedTime.length; i++) {
				for (int j = i+1; j < ingredientUsedTime.length; j++) {
					if(ingredientUsedTime[i]==ingredientUsedTime[j]&&ingredientUsedTime[i]!=0&&ingredientUsedTime[j]!=0) {
						chefsRecipe="NO";
						break outerloop;
					}
				}
			}
			System.out.println(chefsRecipe);
			t--;
		}
	}
	//n times
	private static boolean chefAlreadyUsedIngredient(int[] chefJar, int i) {
		for (int j = 0; j < chefJar.length; j++) {
			if(chefJar[j]==i) {
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
