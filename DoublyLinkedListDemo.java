import java.util.LinkedList;
import java.util.Scanner;
class DoublyLinkedList<T>{
	private LinkedList<T> list= new LinkedList<>();
	public void insertionAtEnd(T element) {
		list.addLast(element);
	}
	public void insertionAtFront(T element) {
		list.addFirst(element);
	}
	public void insertionAtpos(int index, T element) {
		list.add(index,element);
	}
	public void delete(int index) {
		list.remove(index);
	}
	public void display() {
		for(T element : list) {
			System.out.println(element+" ");
		}
		System.out.println();
	}
}
public class DoublyLinkedListDemo {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	DoublyLinkedList<Integer>doublyLinkedList= new DoublyLinkedList<>();
	boolean condition=true;
    while(condition) {
    	System.out.println("Enter your choice:\n"
    			+ "1.Inserton at front\n"
    			+ "2.Insertion at end\n"
    			+ "3.Insertion at any position\n"
    			+ "4.Deletion\n"
    			+ "5.Display\n"
    			+ "6.Exit\n");
    	int choice=sc.nextInt();
    	int element;
    	int index;
    	
    	switch(choice) {
    	case 1:
    	System.out.println("Enter the element");
    	element=sc.nextInt();
    	doublyLinkedList.insertionAtFront(element);
    	break;
    	
    	case 2:
    	System.out.println("Enter the element");
        element=sc.nextInt();
        doublyLinkedList.insertionAtEnd(element);
        break;
        
    	case 3:
    	System.out.println("Enter th element");
    	element=sc.nextInt();
    	System.out.println("Enter the index");
    	index=sc.nextInt();
    	doublyLinkedList.insertionAtpos(element, index);
    	break;
    		
    	case 4:
    	System.out.println("Enter the position");
    	index=sc.nextInt();
    	doublyLinkedList.delete(index);
    	break;
    		
    	case 5:
    	System.out.println("The elements are:\n");
    	doublyLinkedList.display();
    	break;
    	
    	case 6:
    	condition=false;
    	break;
    	
    	default:
        System.out.println("Invalid Entry");
    	break;
       
       }
     }
   }
 }