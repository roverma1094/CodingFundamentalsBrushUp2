package vjudge.part_two;

import java.util.Scanner;

//Too Long letters to be written in abbrevation
//Abbrevation rule : first and Last letter of the word and between them number of letters
public class TwoWayLongWords {
	public static final int MINIMUM_LENGTH = 10;

	public TwoWayLongWords() {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		if (scanner.hasNextInt()) {
			n = scanner.nextInt();
		}
		if (n >= 1 && n <= 100) {
			while (n != 0) {
				if (scanner.hasNext()) {
					String word = scanner.nextLine();
					if (!word.isEmpty()&&word.length() < 100&&isLowerCase(word)) {
						System.out.println(formAbbrevation(word));
					n--;
					}
				}
			}
		}
		scanner.close();
	}
	
	/**
	 * 
	 * @param word
	 * @return
	 */
	private boolean isLowerCase(String word) {
		char[] wordChar=word.toCharArray();
		for (char c : wordChar) {
			if(!(c >= 'a' && c <= 'z')) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param word
	 * @return
	 */
	private String formAbbrevation(String word) {
		if (word.length() > MINIMUM_LENGTH) {
			int lengthOfWord = word.substring(1, word.length() - 1).length();
			if (lengthOfWord >= MINIMUM_LENGTH) {
				StringBuilder buildWord = new StringBuilder();
				buildWord.append(word.charAt(0)).append(lengthOfWord).append(word.charAt(word.length() - 1));
				return buildWord.toString();
			} else {
				return word;
			}
		} else {
			return word;
		}
	}

	public static void main(String[] args) {
		new TwoWayLongWords();
	}
}
