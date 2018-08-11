package week1challenge;

public class SumOfNosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int getNumbers [] = {13,25,9,56,54,89,17};
		int sum = 0; 
		
		int i;
		for (i=0; i<=6;i ++)
			sum = sum + getNumbers [i];
			System.out.println(sum);
	}

}
