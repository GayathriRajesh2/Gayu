package week2codechallenge;

import java.util.Scanner;

public class IsDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Get the value of first number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Get the value of second number");
		int b = sc.nextInt();
		
		if ((a % 3) == 0 && (b % 3) == 0)
	         System.out.println ("FIZZBUZZ");
		else if 
			(a % 3 == 0 || (b % 3) == 0) 
			 System.out.println ("FIZZ");
		else if
		    (a % 5 == 0 || (b % 5) == 0) 
		    System.out.println ("BUZZ");
		else 
			 if (((a % 3) != 0) && (b % 5) != 0)
			System.out.println (a);
		    System.out.println (b);
		
		
	}

}
