package week1homework;

public class AccessArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int div = 20;
		ArithmeicOperations ao = new ArithmeicOperations();
        ao.addition();
        System.out.println("Subtraction of " + ao.numberOne + " from " + ao.numberTwo + " is " + ao.subtraction());
        System.out.println("Multiplication of " + ao.numberOne + " cross " + ao.numberTwo + " is " + (ao.multiply()));
        ao.multiplyNumberOneByTwo();
        System.out.println("Division of " + div + " by " + ao.numberTwo + " is " + ao.divideNumberTwoBy(div));
	}
}
