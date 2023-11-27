package MyPackage;

import java.util.Scanner;

public class TestCircularQueue {
	
	public static void main(String[] args)
{

    System.out.println("enter length of array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
	CircularQueuee ob=new CircularQueuee( n);
	
	ob.enqueue();
	ob.enqueue();
	ob.enqueue();
	ob.enqueue();
	
	
	ob.dequeue();
	ob.dequeue();
	ob.dequeue();
	ob.dequeue();
	
	ob.enqueue();
	ob.enqueue();
	ob.enqueue();
	ob.enqueue();
	ob.enqueue();
	
	ob.dequeue();
	ob.dequeue();
	ob.dequeue();
	ob.dequeue();

	}
	
	
}
