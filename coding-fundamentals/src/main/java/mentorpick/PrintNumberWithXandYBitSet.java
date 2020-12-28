package mentorpick;

import java.util.Scanner;

public class PrintNumberWithXandYBitSet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(((1l<<x)|(1l<<y)));
		}
		scanner.close();
	}
}
