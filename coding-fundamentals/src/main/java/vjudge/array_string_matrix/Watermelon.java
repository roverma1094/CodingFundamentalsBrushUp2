package vjudge.array_string_matrix;

import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			int kilo=scanner.nextInt();
			if(kilo%2==0&&kilo>2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		scanner.close();
	}
	
}
