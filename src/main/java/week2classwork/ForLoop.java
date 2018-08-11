package week2classwork;

public class ForLoop {
	
	public void multiplicationTable(int multiplyWithValue)
	{
		int i;
		//multiplyWithValue = 2;
		for (i=1; i<=10; i++)
		{
		  System.out.println(i + "*" +  multiplyWithValue + " = " + (i * multiplyWithValue));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop fl = new ForLoop();
		fl.multiplicationTable(2);
	}
}


