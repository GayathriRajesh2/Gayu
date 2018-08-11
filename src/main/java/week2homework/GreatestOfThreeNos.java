package week2homework;

import java.util.*;

public class GreatestOfThreeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	
		int a,b,c;
		System.out.println ("Enter the value of three numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a> b && a > c)
		{
			System.out.println("The number a is greatest");
		}
	
		else if (b>a && b> c)
		{
			
			System.out.println("The number b is greatest");
		}
		else 
		{
			System.out.println("The number c is greatest");
		}
	}

}
