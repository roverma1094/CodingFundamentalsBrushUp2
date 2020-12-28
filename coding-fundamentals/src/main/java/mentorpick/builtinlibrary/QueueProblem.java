package mentorpick.builtinlibrary;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueProblem {
	static final int PUSH = 0, POP = 1;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			// For Every Test, We need to create new Queue
			Queue<Integer> q = new LinkedList<Integer>();

			int opsCount = sc.nextInt();
			StringBuilder builder = new StringBuilder();
			for (int op = 1; op <= opsCount; op++) {
				int opType = sc.nextInt();
				if (PUSH == opType) {
					int data = sc.nextInt();
					q.add(data);
				} else if (POP == opType) {
					builder.append(q.poll()).append(" ");
				}
			}
			System.out.println(builder.toString().trim());
		}
	}

}
