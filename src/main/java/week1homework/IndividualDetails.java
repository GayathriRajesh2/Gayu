package week1homework;

public class IndividualDetails {
String myName = "Gayathri";
int myAge = 34;
String myFavouriteColour = "Yellow";
String friendOneName = "Sandhya";
int friendOneAge= 33;
String friendOneFavouriteColour = "Blue";
String FriendTwoName = "Lavanya";
int friendTwoAge = 35;
String friendTwoFavouriteColour ="purple";


public void displayValues()
{
	System.out.println(myName);
	System.out.println(myAge);
	System.out.println(myFavouriteColour);
	System.out.println(friendOneName);
	System.out.println(friendOneAge);
	System.out.println(friendOneFavouriteColour);
	System.out.println(FriendTwoName);
	System.out.println(friendTwoAge);
	System.out.println(friendTwoFavouriteColour);
	
}


public static void main(String[] args)  
{
	IndividualDetails id = new IndividualDetails();
	/*System.out.println(id.myName);
	System.out.println(id.myAge);
	System.out.println(id.myFavouriteColour);
	System.out.println(id.friendOneName);
	System.out.println(id.friendOneAge);
	System.out.println(id.friendOneFavouriteColour);
	System.out.println(id.FriendTwoName);
	System.out.println(id.friendTwoAge);
	System.out.println(id.friendTwoFavouriteColour);*/
	id.displayValues();
	
}
}