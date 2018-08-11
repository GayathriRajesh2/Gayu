package week1challenge;

public class SecondSmallestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num [] = {40, 20, 50};
		int temp;
		
		for(int i=0; i<=1; i++)
		{
			if(num[i+1] < num[i])
			{
				temp = num[i];
				num[i] = num[i+1];
				num[i+1] = temp;
			}
		}
		
		for(int i = 0; i<=2; i++)
			System.out.println(num[i]);
	}

}
