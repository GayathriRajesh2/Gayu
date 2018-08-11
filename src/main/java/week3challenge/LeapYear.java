package week3challenge;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of year");
		year = sc.nextInt();
		
		if ((year % 4 == 0  && year%100 != 0) || (year% 400 == 0))
		{
			System.out.println("The entered value is a leap year");
		}
		else 
		{
			System.out.println("The entered value is not a leap year");
		}
		sc.close();	
}
			
}			
			
			
	
			
			
		/*	
			if ((year % 4) != 0) 
		{
			System.out.println ("The entered value is not a leap year");
		}
		else 
		{
			 if (((year % 100) == 0)) 
			 {
				  if ((year % 400) == 0)
				  {
					  System.out.println ("The entered value is a leap year");
				  }
				  else 
				  {
					  System.out.println ("The entered value is  not a leap year"); 
				  }
			 }
			 else 
			 {
				 System.out.println ("The entered value is a leap year");
			 }
		}
			
	  		   */
		
	



	


