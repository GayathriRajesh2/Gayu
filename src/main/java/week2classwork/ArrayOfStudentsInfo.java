package week2classwork;

import java.util.*;

public class ArrayOfStudentsInfo {

	public static void main(String[] args) {
		
	String [] studentList= {"Raja","Rani","Ram","Sita","Ravi"};
	int [] studentAge = {22,23,24,25,26};
	char [][] studentGrade = {
							{'A','B','C','E','F'},
							{'A','A','A','A','A'},
							{'B','B','B','B','B'},
							{'C','A','B','A','C'},
							{'C','A','B','A','C'}	};
	System.out.println(" Whose value you need to print ");
	Scanner scr = new Scanner(System.in);
	
	int index = scr.nextInt();
	index = index-1;
	System.out.println (studentList [index] + " who is " + studentAge [index] + " Scored " + studentGrade [index] [0] +  " , " + studentGrade [index] [1] + " , " + 
	studentGrade [index] [2] + " , " + studentGrade [index] [3] + " , " + studentGrade [index] [4]);	
	scr.close();
		
}
}	

