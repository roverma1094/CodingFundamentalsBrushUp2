package vjudge.array_string_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scanner=new Scanner(System.in);
		int[] n = new int[1];// since odd below 15 < 7
		for (int i = 0; i < 1; i++) {
			n[i]=scanner.nextInt();
		}

		for (int i = 0; i < n.length; i++) { //n
			if (!(n[i] % 2 == 0)) {
				if (n[i] >= 3 && n[i] <= 15) {
					int[][] magicMatrix = new int[n[i]][n[i]];
					// First Position
					int row = 0;
					int column = n[i] / 2;
					int num = 1;
					magicMatrix[row][column] = num;
					while (num < n[i] * n[i]) {
						int rowCopy = row;
						int columnCopy = column;
						// Next row Position
						rowCopy = rowCopy - 1;
						// Check if it goes out of bound
						if (rowCopy < 0) {
							rowCopy = n[i] - 1;
						}
						// Next column Position
						columnCopy = columnCopy + 1;
						// Check if it goes out of bound
						if (columnCopy > (n[i] - 1)) {
							columnCopy = 0;
						}
						// Check magicMatrix[row][column] already occupied
						if (magicMatrix[rowCopy][columnCopy] != 0) {
							// Back to original position and go down i.e add one
							rowCopy = row + 1;
							// column remains same
							columnCopy = column;
						}
						// All cases above are good then add the value
						magicMatrix[rowCopy][columnCopy] = ++num;
						row = rowCopy;
						column = columnCopy;
					}
					System.out.println("n=" + n[i] + ", sum=" + (n[i] * (((n[i] * n[i]) + 1) / 2)));
					printMatrices(magicMatrix);
					System.out.println("\n");
				}
			}
		}
		scanner.close();
	}

	private static void printMatrices(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < matrix[i].length; j++) {
				builder.append(matrix[i][j]).append(" ");
			}
			System.out.println(builder.toString().trim());
		}
	}
}
