import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
public static void main(String args[]) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	String line=sc.nextLine();
	StringTokenizer tokenizer=new StringTokenizer(line);
	while(tokenizer.hasMoreTokens())
	{
		int number=Integer.parseInt(tokenizer.nextToken());
		System.out.println(number);
		sum=sum+number;
	}
	System.out.println("Sum is: "+sum);
}
}
