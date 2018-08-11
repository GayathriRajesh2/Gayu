package week2codechallenge;

import java.util.Scanner;

public class FirstNPrimeNumbers {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		int y ; 	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number :");
		n = sc.nextInt();   
		for(int i=2;i<n;i++)
			{
				y=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						y=1;
				}
						if(y==0){
								System.out.println(i);
	    	}
		}
		}

		
		
		
	}



