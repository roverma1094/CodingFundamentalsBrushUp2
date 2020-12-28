package mentorpick.builtinlibrary;

import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
	static final int PUSH = 0, POP = 1;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			// For Every Test, We need to create new Stack
			Stack<Integer> stk = new Stack<Integer>();
			StringBuilder builder = new StringBuilder();
			int opsCount = sc.nextInt();
			for (int op = 1; op <= opsCount; op++) {
				int opType = sc.nextInt();
				if (PUSH == opType) {
					int data = sc.nextInt();
					stk.push(data);
				} else if (POP == opType) {
					builder.append(stk.pop()).append(" ");
				}
				
			}
			System.out.println(builder.toString().trim());
		}
	}
}
