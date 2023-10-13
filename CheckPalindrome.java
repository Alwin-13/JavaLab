import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	  String input=sc.next();
	  boolean isPalindrome = check(input);
	  if(isPalindrome)
	  {
		  System.out.println("The given string is Palindrome");
	  }
	  else
	  {
		  System.out.println("The given String is not Palindrome");
	  }
	}
	  static boolean check(String input)
	  {
		  char []charArray= input.toCharArray();
		  int length=input.length();
		  for(int i=0;i<=length/2;i++)
		  {
			  if(charArray[i]!=charArray[length-1-i])
			  {
				  return false;
			  }
		  }
		  return true;
	  }


	}

