package part_two;

import java.util.Scanner;

public class FootBall2 {
	
	public static void main(String[] args) {
		String[] dangerousPatterns= {"1111111","0000000"};
		String inputPattern = null;
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNext()) {
			inputPattern=scanner.nextLine();
		}
		System.out.println(inputPattern.contains(dangerousPatterns[0])||inputPattern.contains(dangerousPatterns[1])?"YES":"NO");
		scanner.close();
	}
}
