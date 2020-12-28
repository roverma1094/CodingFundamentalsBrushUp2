package mentorpick.builtinlibrary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOperations {
	static final int ADD_KEY_VALUE = 0, CHECK_KEY_EXISTANCE = 1, PRINT_VALUE_FOR_KEY = 2, COUNT_KEYS = 3,
			REMOVE_KEY = 4;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			// For Every Test, We need to create new Stack
			Map<Integer, Integer> mp = new HashMap<>();

			int opsCount = sc.nextInt();
			StringBuilder builder=new StringBuilder();
			for (int op = 1; op <= opsCount; op++) {
				int opType = sc.nextInt();
				if (opType == ADD_KEY_VALUE) {
					int key = sc.nextInt();
					int value = sc.nextInt();
					mp.put(key, value);
				} else if (opType == CHECK_KEY_EXISTANCE) {
					int key = sc.nextInt();
					builder.append(mp.containsKey(key)).append(" ");
				} else if (opType == PRINT_VALUE_FOR_KEY) {
					int key = sc.nextInt();
					builder.append(mp.get(key)).append(" ");
				} else if (opType == COUNT_KEYS) {
					builder.append(mp.keySet().size()).append(" ");
				} else if (opType == REMOVE_KEY) {
					int key = sc.nextInt();
					mp.remove(key);
				}
			}
			System.out.println(builder.toString().trim());
		}
	}

}
