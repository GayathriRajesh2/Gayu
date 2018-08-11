package week1homework;

public class OddOrEven {
	
		public void evenOrOdd(int number)
		
		{
			if ((number % 2) == 0)
				System.out.println("The number " + number + " is " + "Even");
			else 
				System.out.println ("The number " + number + " is " + "Odd");
		}
		
		public boolean isPrime(int number)
		{
			if (number == 1)
				return false;
			for (int i=2; i<= number/2; i++)
			{
				if ((number % i) == 0)
						return false;
					
			}
			return true;	
		}

	public static void main(String[] args) {
		// TODO A3uto-generated method stub
			OddOrEven oe = new OddOrEven() ;
			oe.evenOrOdd(923);
			oe.evenOrOdd(444);
			oe.evenOrOdd(333);
			
			System.out.println(oe.isPrime(19));
			System.out.println(oe.isPrime(923));
			System.out.println(oe.isPrime(1));
			System.out.println(oe.isPrime(2));
	}

}
