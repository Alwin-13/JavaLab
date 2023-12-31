
import java.util.Scanner;

class MultipicationTable{
	synchronized void multiplication(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(i+" X "+num+" = "+i*num);
		}
	}
}

class Thread1 extends Thread{
	MultipicationTable m;
	int digit;
	Thread1(MultipicationTable m,int digit){
		this.m=m;
		this.digit=digit;
	}
	public void run() {
	m.multiplication(digit);
	}
}

class Thread2 extends Thread{
	MultipicationTable m;
	int digit;
	Thread2(MultipicationTable m,int digit){
		this.m=m;
		this.digit=digit;
	}
	public void run() {
	m.multiplication(digit);
	}
}

class Thread3 extends Thread{
	MultipicationTable m;
	int digit;
	Thread3(MultipicationTable m,int digit){
		this.m=m;
		this.digit=digit;
	}
	public void run() {
	m.multiplication(digit);
	}
}

public class Threadsdemo {
    public static void main(String [] args) {
    	Scanner sc=new Scanner(System.in);
    	MultipicationTable mtable=new MultipicationTable();
    	int number;
    	
    	System.out.println("Enter the 1st Table that you want to display:");
		number =sc.nextInt();
		Thread1 thread1=new Thread1(mtable,number);
		
		System.out.println("Enter the 2nd Table that you want to display:");
		number =sc.nextInt();
		Thread2 thread2=new Thread2(mtable,number);
		
		System.out.println("Enter the 3rd Table that you want to display:");
		number =sc.nextInt();
		Thread3 thread3=new Thread3(mtable,number);
		
		sc.close();
		thread1.start();
		thread2.start();
		thread3.start();		
    }
}