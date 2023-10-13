import java.util.Scanner;

public class MethodOverloading{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the base of Triangle");
	    float base=sc.nextFloat();
	    System.out.println("Enter the height of Triangle");
	    float height=sc.nextFloat();
	    System.out.println("Enter the length of Rectangle");
	    int length=sc.nextInt();
	    System.out.println("Enter the breadth of Rectangle");
	    int breadth=sc.nextInt();
	    System.out.println("Enter the radius of the Circle");
	    float radius=sc.nextFloat();
	    Shapes shapes=new Shapes();
	    shapes.Area(base,height);
	    shapes.Area(length,breadth);
	    shapes.Area(radius);    
	}
	
}
class Shapes
{
	float area;
	void Area(float base,float height)
	{
		area=(float)(0.5*base*height);
		System.out.println("Area of Triangle is "+area);
	}
	void Area(int length,int breadth)
	{
		area=length*breadth;
		System.out.println("Area of Rectangle is "+area);
	}
	void Area(float radius)
	{
		area=(float)(3.14*radius*radius);
		System.out.println("Area of Circle is "+area);
	}
	
}

