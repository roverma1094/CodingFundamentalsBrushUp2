package mentorpick.builtinlibrary;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeOperations {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			// For Every Test, We need to create new Stack
			Deque<Integer> deque = new LinkedList<Integer>();
			StringBuilder builder = new StringBuilder();
			int opsCount = sc.nextInt();
			while (opsCount > 0) {
				String opType = sc.nextLine();
				if (!opType.isEmpty()) {
					if (opType.contains("insert_back")) {
						int data = Integer.parseInt(opType.split(" ")[1]);
						deque.offerLast(data);
					} else if (opType.contains("insert_front")) {
						int data = Integer.parseInt(opType.split(" ")[1]);
						deque.offerFirst(data);
					} else if (opType.contains("remove_back")) {
						int value = 0;
						try {
							value = deque.removeLast();
						} catch (Exception e) {

						}
						builder.append(value == 0 ? "EMPTY" : value).append(" ");
					} else if (opType.contains("remove_front")) {
						int value = 0;
						try {
							value = deque.removeFirst();
						} catch (Exception e) {

						}
						builder.append(value == 0 ? "EMPTY" : value).append(" ");
					} else if (opType.contains("print_back")) {
						builder.append(deque.peekLast() != null ? deque.peekLast() : "EMPTY").append(" ");
					} else if (opType.contains("print_front")) {
						builder.append(deque.peekFirst() != null ? deque.peekFirst() : "EMPTY").append(" ");
					}
					opsCount--;
				}

			}
			System.out.println(builder.toString().trim());
		}
	}
}
