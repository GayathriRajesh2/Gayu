package week2classwork;

import java.util.Scanner;

public class ForLoopArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String studentName [] = {"Raja","Rani","Ram","Sita","Ravi"};
      int studentAge [] = {12,13,14,15,16};
      char studentGrade [][] = {{'A', 'B','C', 'D','E'},
    		  {'B', 'A','C', 'D','E'},
    		  {'C', 'A','C', 'D','E'},
    		  {'A', 'A','A', 'A','A'},
    		  {'B', 'B','B', 'B','B'}};
      
      	//System.out.println(" Enter the value of input ");
      	//Scanner scr = new Scanner(System.in);
      	//int idx = scr.nextInt();
        int idx;
        for (idx =0 ; idx<=4 ;idx ++)
        {
      	System.out.print("\n" + studentName [idx] + " who is " + studentAge [idx] + " years old Scored ");
      	for (int i = 0; i <=4 ; i++)
      		System.out.print(studentGrade [idx][i] +",");
        }
	}

}
