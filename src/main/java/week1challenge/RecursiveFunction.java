package week1challenge;

import java.util.Scanner;

public class RecursiveFunction {
	
	String name;
	
	public void swap(char[] array, int i,int j)
	{
		
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
 		if(i >= (name.length()/2) - 1)
			return;
		else
			swap(array, ++i, --j);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		RecursiveFunction rs = new RecursiveFunction();
		int i=0;
		Scanner sc = new Scanner(System.in);
		rs.name = sc.next();
		
		int j=rs.name.length()-1;
		
		
		
		char [] array;
		array = rs.name.toCharArray();
		rs.swap(array,i,j);
		
		rs.name = String.valueOf(array);
		
		System.out.println(rs.name);
	}

}
