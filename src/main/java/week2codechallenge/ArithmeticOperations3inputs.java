package week2codechallenge;

import java.util.Scanner;

public class ArithmeticOperations3inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int x;
          int y;
         // String z;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number : ");
          x = sc.nextInt();
          System.out.println("Enter the second number : ");
          y = sc.nextInt();
          System.out.println("Enter the Operation:");
          String operation = sc.next();
         
  		  switch (operation)
  		  {
  		  case "Add":System.out.println("addition of two numbers is" + (x+y));break;
  		  case "subtract":System.out.println("Subtraction of two numbers is" + (x-y));break;
  		  case "multiplication":System.out.println("multiplication of two numbers is" + (x*y));break;
  		  case "division":System.out.println("division of two numbers is" + (x/y));break;
	   	
  		  }
  		
          
          
         
		
		
                  
	}

}
