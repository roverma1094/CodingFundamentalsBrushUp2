package vjudge.part_two;

import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

public class GradingStudents {

	final static int MINIMUM_MARK = 38;
	final static int DIVISIBLE_NUMBER = 5;

	public static void main(String[] args) {
		// Number of students
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt())
			n = scanner.nextInt();
		if (1 <= n && n <= 60) {
			int[] marks = new int[n];
			int i = 0;
			while (i < n) {
				if (scanner.hasNextInt())
					marks[i] = scanner.nextInt();
				i++;
			}
			calculateGrades(marks);
		}
		scanner.close();
	}

	private static void calculateGrades(int[] marks) {
		for (int mark : marks) {
			if (0 <= mark && mark <= 100) {
				if (mark >= MINIMUM_MARK) {
					int nextDivibleNumber = ((mark / DIVISIBLE_NUMBER) + 1) * DIVISIBLE_NUMBER;
					int differenceValue = nextDivibleNumber - mark;
					if (differenceValue < 3) {
						System.out.println(nextDivibleNumber);
					}else {
						System.out.println(mark);
					}
				} else {
					System.out.println(mark);
				}
			}

		}
	}
}
