package mentorpick;

import java.util.Scanner;

public class SetKthBit {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		SetKthBit test = new SetKthBit();
      	while(sc.hasNext()){
          int N = sc.nextInt();
          int k = sc.nextInt();
          System.out.println(test.setKthBit(N, k));
        }
	}
	int setKthBit(int N, int K)
    {
		return N|(1<<K);
    }
}
