package week1homework;

public class ArithmeicOperations {
 // Initialization of variables
	int numberOne = 30;
    int numberTwo = 10;

 public void addition()
 {
	 System.out.println("Addition of " + numberOne + " & " + numberTwo + " is " + (numberOne + numberTwo));
}
 public int subtraction()
 {
	 return(numberOne - numberTwo);
 }
 public int multiply()
 {
	 return(numberOne*numberTwo);
	  
 }
 public void multiplyNumberOneByTwo()
 {
	 System.out.println("Multiplication of " + numberOne + " by " + " 2 " + " is " + (numberOne*2));
 }
 public int divideNumberTwoBy(int dividend)
 {
	 return (dividend/numberTwo);
 }
}
