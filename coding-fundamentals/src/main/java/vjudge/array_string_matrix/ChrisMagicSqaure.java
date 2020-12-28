package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChrisMagicSqaure {
	public static void main(String[] args) {
		FastReader reader=new FastReader();
		int rc=reader.nextInt();
		int[][] magicMatrix=new int[3][3]; 
		int magicConstant=0;
		for (int i = 0; i < rc; i++) {
			int magicValueTotal=0;
			for (int j = 0; j < rc; j++) {
				magicMatrix[i][j]=reader.nextInt();
				magicValueTotal+=magicMatrix[i][j];
			}
			if(magicValueTotal>magicConstant) {
				magicConstant=magicValueTotal;
			}
		}
		int valueAdded=0;
		int primaryDiagonal=0,secondaryDiganol=0;
		for (int i = 0; i < magicMatrix.length; i++) {
			int sumOfRow=0;
			for (int j = 0; j < magicMatrix[i].length; j++) {
				if(magicMatrix[i][j]==0) {
					valueAdded=magicConstantOfRow(magicMatrix,i,j,rc);
					magicMatrix[i][j]=magicConstant-valueAdded;
				}
				if(i==j) {
					primaryDiagonal+=magicMatrix[i][j];
				}else if((i+j)==(rc-1)){
					secondaryDiganol+=magicMatrix[i][j];
				}
				sumOfRow+=magicMatrix[i][j];
			}
			if(!(sumOfRow==primaryDiagonal&&primaryDiagonal==secondaryDiganol)) {
				valueAdded=-1;
				break;
			}
		}
		
			System.out.println(valueAdded);
	}
	
	private static boolean isMagicMatrix(int[][] magicMatrix, int magicConstant) {
		for (int i = 0; i < magicMatrix.length; i++) {
			for (int j = 0; j < magicMatrix.length; j++) {
				
			}
		}
		return false;
	}
	private static int magicConstantOfRow(int[][] magicMatrix, int i, int j, int rc) {
		int magicValue=0;
		for (int column = 0; column < rc; column++) {
			magicValue=magicMatrix[i][column];
		}
		return magicValue;
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
