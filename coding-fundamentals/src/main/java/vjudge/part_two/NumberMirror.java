package vjudge.part_two;

import java.util.Scanner;

public class NumberMirror {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNextInt()) {
			int value=scanner.nextInt();
			System.out.println(value);
		}
		scanner.close();
	}
}
