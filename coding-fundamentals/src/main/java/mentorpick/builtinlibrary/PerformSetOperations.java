package mentorpick.builtinlibrary;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PerformSetOperations {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			// For Every Test, We need to create new Stack
			Set<Integer> set = new HashSet<Integer>();

			int opsCount = sc.nextInt();
			StringBuilder builder=new StringBuilder();
			for (int op = 1; op <= opsCount; op++) {
				int opType = sc.nextInt();
				int operand = sc.nextInt();
				if(opType==0) {
					set.add(operand);
				}else if(opType==1) {
					builder.append(set.contains(operand)).append(" ");
				}else if(opType==2) {
					set.remove(operand);
				}

			}
			System.out.println(builder.toString().trim());
		}
	}

}
