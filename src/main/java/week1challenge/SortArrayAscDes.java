package week1challenge;

public class SortArrayAscDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {103,25,99,56,54,89,17};
      int i;
      int j;
      int temp;
      for (i=0 ; i<=6; i++)
      {
    	  for(j= i+1 ;j<=6; j++)
    	  {
    		  if (array[i] < array[j])
    		   {
    			temp = array[i];
    			array[i] = array [j];
    			array[j] = temp;		  
    		 }
       }
      }
     	
      for (i= 0 ; i<=6;i ++)
      {
    	  System.out.println(array[i]);
      }
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	