import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	
	int i,j,row1,column1,row2,column2;
	System.out.println("Enter the number of rows and columns of 1st Matrix");
	row1=sc.nextInt();
	column1=sc.nextInt();
	System.out.println("Enter the number of rows and columns of 2nd Matrix");
	row2=sc.nextInt();
	column2=sc.nextInt();
	int matrix1[][]=new int[row1][column1];
	int matrix2[][]=new int[row2][column2];
	int matrix3[][]=new int[row1][column2];
	if(column1==row2)
	{
	System.out.println("Enter the values of 1st Matrix");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<column1;j++)
		{
			matrix1[i][j]= sc.nextInt();
		}
	}
	System.out.println("Enter the values of 2nd Matrix");
	for(i=0;i<row2;i++)
	{
		for(j=0;j<column2;j++)
		{
			matrix2[i][j]= sc.nextInt();
		}
	}
	System.out.println("Product of matrix is:");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<column2;j++)
		{
		matrix3[i][j]=0;
				for(int k=0;k<column1;k++)
				{
					matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
		System.out.print(matrix3[i][j]+" ");
		}
        System.out.println();
	}
	}
	else
	{
		System.out.println("Matrix multiplication is not possible");
	}
	}
}
