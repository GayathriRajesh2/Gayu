package week1challenge;

import org.apache.poi.util.SystemOutLogger;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 int number1 = 20;
         int number2 = 40;
         int number3 = 60;
      /*   
        if((number1 < number2) && (number2 < number3))
        	System.out.println(number2);
        else if((number2 < number3) && (number3 < number1))
        	System.out.println(number3);
        else if((number3 < number1) && (number1 < number2))
        	System.out.println(number1);*/
        
             
         if(number1 < number2)
         {
        	 if(number2 < number3)
        	 {
        		 System.out.println(number2);
        	 }
        	 else
        	 {
        		 if(number3 > number1)
        		 {
        			 System.out.println(number3);
        			 
        		 }
        		 else
        		 {
        			 System.out.println(number1);
        		 }
        	 }
         }
         else
         {
        	 if(number3 < number1)
        	 {
        		 System.out.println(number1);
        	 }
        	 else
        	 {
        		 if(number2 < number3)
        		 {
        			 System.out.println(number2);
        		 }
        		 else
        		 {
        			 System.out.println(number3);
        		 }
        	 }
         }
        	 
         
	}
}

