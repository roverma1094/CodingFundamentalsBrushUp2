package mentorpick.builtinlibrary;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueWithMaxHeap {
	static final int PUSH = 0, TOP = 1, COUNT = 2, POP = 3;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
			StringBuilder builder = new StringBuilder();
			int opsCount = sc.nextInt();
			while (opsCount > 0) {
				int opType = sc.nextInt();
				if (opType == PUSH) {
					int data = sc.nextInt();
					pQueue.offer(data);
				} else if (opType == TOP) {
					builder.append(pQueue.peek()).append(" ");
				} else if (opType == COUNT) {
					builder.append(pQueue.size()).append(" ");
				} else if (opType == POP) {
					pQueue.poll();
				}
				opsCount--;
			}
			System.out.println(builder.toString().trim());
		}
	}

}
