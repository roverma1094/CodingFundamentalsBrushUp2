package mentorpick;

import java.util.Scanner;

public class XBitFollowedByYBits {
	public static void main(String[] args) {
		Scanner fasterReader=new Scanner(System.in);
		while(fasterReader.hasNext()) {
			int x=fasterReader.nextInt();
			int y=fasterReader.nextInt();
			
			long result=(((1l<<x)-1)<<y);
			System.out.println(result);
		}
		fasterReader.close();
	}

}
