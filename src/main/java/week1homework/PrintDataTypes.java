package week1homework;

public class PrintDataTypes {
	
	int myFirstDataType = 10;
	float mySecondDataType = 10.50f;
	double myThirdDataType = 20.50d;
	long myFourthDataType = 10L;
	char myFifthDataType = 'G';
	boolean mySixthDataType = true;
	short mySeventhDataType = 5;
	byte myEighthDataType = 2;
	
	public void callDataTypes()
	{
	System.out.println("My First datatype is Int = " + myFirstDataType);
	System.out.println("My second datatype is Float = " + mySecondDataType);
	System.out.println("My Third datatype is Double = "+ myThirdDataType);
	System.out.println("My Fourth datatype is Long = "+ myFourthDataType);
	System.out.println("My Fifth datatype is Char = " + myFifthDataType);
	System.out.println("My Sixth datatype is Boolean = " +mySixthDataType);
	System.out.println("My Seventh datatype is Short = " + mySeventhDataType);
	System.out.println("My Eighth datatype is Byte = " + myEighthDataType);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDataTypes dt = new PrintDataTypes ();
		/*System.out.println(dt.myFirstDataType);
		System.out.println(dt.mySecondDataType);
		System.out.println(dt.myThirdDataType);
		System.out.println(dt.myFourthDataType);
		System.out.println(dt.myFifthDataType);
		System.out.println(dt.mySixthDataType);
		System.out.println(dt.mySeventhDataType);
		System.out.println(dt.myEighthDataType);*/
        dt.callDataTypes();
	}

}
