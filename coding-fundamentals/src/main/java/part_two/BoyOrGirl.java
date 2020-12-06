package part_two;

import java.util.ArrayList;
import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNext()) {
			String inputPattern=scanner.nextLine();
			int distinctCharacterCount=0;
			ArrayList<Character> distinctCharacter=new ArrayList<Character>();//Many occupy extra memory
			for (int i=0;i<inputPattern.length();i++) {
				char currentCharacter=inputPattern.charAt(i);
				if(!distinctCharacter.contains(currentCharacter)) {
					distinctCharacter.add(currentCharacter);
					distinctCharacterCount++;
				}
			}
			System.out.println(distinctCharacterCount%2==0?"CHAT WITH HER!":"IGNORE HIM!");
		}
		scanner.close();
		
	}
}
