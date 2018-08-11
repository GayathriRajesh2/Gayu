package week3challenge;

import java.util.ArrayList;

public class ArrayOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] duplicateNumbers = {13,65,15,67,88,65,13,99,67,13,65,87,13};
        ArrayList al = new ArrayList();
        int i; int j,k=0;
        
        
        for (i = 0 ; i <=duplicateNumbers.length-1 ;i++)
        {
        	for (j=i+1 ;j<=duplicateNumbers.length-1;j++)
        	{
        		if (duplicateNumbers [i] == duplicateNumbers [j])
        		{
        			
        			if(!al.contains(duplicateNumbers [i]))
        			{
        				System.out.println(duplicateNumbers [i]);
        				al.add(duplicateNumbers [i]);
        				break;
        			}
        		}
        	}
        	
        	
        	
        }
        
        
	}

}
