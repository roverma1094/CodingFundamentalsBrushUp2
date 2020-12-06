package part_two;

import java.util.Scanner;

public class FootBall {
	private Scanner scanner;
	private String inputPattern;
	private String teamX="0";
	private String teamY="1";
	private int patternLength=100;
	private String[] dangerousPatterns= {"1111111","0000000"};
	
	public FootBall() {
		try {
		System.out.println("Please enter some pattern");
		scanner=new Scanner(System.in);
		if(scanner.hasNext()) {
			inputPattern=scanner.nextLine();
		}
//		validateInput(inputPattern);
		if(approach1(inputPattern))
			System.out.println("YES");
		else
			System.out.println("NO");
		}catch (Exception e) {
//			System.err.println(e.getMessage());
		}
	}
	/**
	 * Validate Input
	 * 1. Input contains both team member
	 * 2. Input length should not be greater than 100
	 * @param inputPattern
	 */
	private void validateInput(String inputPattern) {
		if(inputPattern.isEmpty()) {
			throw new RuntimeException("Input Pattern cannot be blank");
		}
//		if(!inputPattern.matches("[0-1]")){
//			throw new RuntimeException("Invalid Input");
//		}
//		
		if(inputPattern.length()>patternLength) {
			throw new RuntimeException("Input Pattern length should not be greater then 100");
		}
		
		if(!inputPattern.contains(teamX)||!inputPattern.contains(teamY)) {
			throw new RuntimeException("Atleast a member of both teams should be present");
		}
		
	}
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		new FootBall();
	}
	/**
	 * Approach Using Contains 
	 * @param inputPattern
	 * @return
	 */
	public boolean approach1(String inputPattern) {
		for (String dangerousPattern : dangerousPatterns) {
			if(inputPattern.contains(dangerousPattern))
				return true;
		}
		return false;
	}
}
