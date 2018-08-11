package week1challenge;

import java.util.Scanner;

public class MultiplicationTable {

	public void multiplicationValues(int j,int multiplyvalue)
	{
		int i = 0; 
		for(i= 1; i <=j; i++)
		{
			System.out.println( (i) + " * " + (multiplyvalue)  + " = " + (i * multiplyvalue));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int i , j;
		System.out.println("Enter the value of number 1");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println("Enter the value of number 2");
		j = sc.nextInt();
		MultiplicationTable mt = new MultiplicationTable ();
		mt.multiplicationValues(i,j);
	}
        
}
