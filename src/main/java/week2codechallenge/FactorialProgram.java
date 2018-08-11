package week2codechallenge;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        int factorial;
        System.out.println("The value of number is: ");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		factorial = j;
		 for (i= j-1 ; i >=1; i--)
		 {
			 factorial = (factorial * i);
		 }
			  
		 System.out.println(factorial);		
		
	}

}
