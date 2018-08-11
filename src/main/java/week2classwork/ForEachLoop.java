package week2classwork;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String studentName [] = {"Raju","Ram","Laxman"};
		int studentAge [] = {20, 21, 22};	
		for (String getName : studentName)
		{
			System.out.println(" The student name is " + getName + " and the length of the character is " + getName.length());
		}
	}
}
 
