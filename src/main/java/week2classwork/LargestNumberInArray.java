package week2classwork;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int getNumber [] = {20, 22, 666, 23, 22};
		
		int largestNumber = getNumber [0];
		for (i = 1; i<= 4 ;i++)
		{
			if (largestNumber < getNumber [i])
				largestNumber = getNumber [i];
			
		}
		
		System.out.println(largestNumber);
		int count = 0; 
		for (i = 0; i<=4;i++)
		{
			if (getNumber [i] == 22)
			{
				count++;
			}
			
				
		}
		System.out.println(count);
	}

}
