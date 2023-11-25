package MyQueue;

import java.util.Scanner;

public class linearQueue {
	
	 Scanner sc=new Scanner(System.in);
		private  int[] arr;
		int rear;
		int front;
		int n;
	
	
	public linearQueue(int n1) {
		rear=-1;
		front=0;
		n=n1;
		arr=new int[n1];
	}

	
	
	public  void enqueue()
	{
		
		boolean flag1=isfull(rear);
		
		if(flag1)
		{
			System.out.println("queue is full");
		}
		else
		{
			rear++;
			System.out.println("enter element");
			int m=sc.nextInt() ;
			arr[rear]=m ;
			System.out.println("element is added successfully");
			
		}
		
		
		
	}
	
	public  void dequeue()
	{
		
		boolean flag2=isnotempty(front);
		
		if(flag2)
		{
			front++;
			System.out.println("element deleted successfully");
			
		}
		else
		{
			System.out.println("it is aldready empty");
		}
		
		
	}
	
	public  boolean isfull(int rear)
	{
		
	 if(rear==(n-1))
	 {
			 
	 return true;
	 }
	 return false;	
	}
	
	
	public  boolean isnotempty(int front)
	{
	
		if(front>rear)
		{
		 return false;
		}
		return true;	
}

	public void display() {
		
		System.out.println("Elements in queue are");
		for(int i=0;i<=rear;i++)
		{
			int j=arr[i];
			System.out.println(j);
			
		}
		
		
	}
}



