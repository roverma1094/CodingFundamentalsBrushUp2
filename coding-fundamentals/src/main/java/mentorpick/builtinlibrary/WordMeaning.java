package mentorpick.builtinlibrary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMeaning {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numberOfPairs = sc.nextInt();
		Map<String, String> wordPairs = new HashMap<String, String>();
		while (numberOfPairs > 0) {
			String nextLine = sc.nextLine();
			if (!nextLine.isEmpty()) {
				String[] wordPair = nextLine.split(" ");
				wordPairs.put(wordPair[0], wordPair[1]);
				numberOfPairs--;
			}
		}
		int numberOfQueries = sc.nextInt();
		while (numberOfQueries > 0) {
			String query = sc.nextLine();
			if (!query.isEmpty()) {
				System.out.println(wordPairs.get(query));
				numberOfQueries--;
			}
		}
	}
}
