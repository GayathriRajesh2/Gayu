package week2codechallenge;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Get the value of first number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Get the value of second number");
		int b = sc.nextInt();
		a = (a + b);
		b = (a-b);
		a = (a-b);
		System.out.println("The value of first swapped number is " + a);
		System.out.println("The value of second swapped number is " + b);

	}

}
