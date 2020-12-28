package vjudge.part_two;

import java.util.Scanner;

public class HelpingChef {
	
	public HelpingChef() {
		int t=0;
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNextInt()) {
			t=scanner.nextInt();
		}
		if(t>=1 && t<=1000) {
			while(t!=0) {
				int n=scanner.nextInt();
				if(n>=-20&&n<=20) {
					if(n<10) {
						System.out.println("Thanks for helping Chef!");
					}else {
						System.out.println("-1");
					}
				}
				t--;
			}
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new HelpingChef();
	}
}
