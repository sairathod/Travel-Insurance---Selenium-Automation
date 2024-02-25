package Scanner;

import java.util.*;

public class Polindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		int number=in.nextInt();
		
		int res=checkPolindrome(number);
		System.out.print(res+" ");
		
		if(res==number) System.out.print("Polindrome");
		else System.out.print("Not a Polindrome");

	}
	public static int checkPolindrome(int number)
	{
		int rev=0;
		
		while(number>0)
		{
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		return rev;
	}

}
