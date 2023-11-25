package MyQueue;

import java.util.Scanner;

public class TestLinearQueue {
	

   
   public static void main(String[] args) 
   {
	
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array length");
   int n=sc.nextInt();
   linearQueue object=new linearQueue(n);
   object.enqueue();
   object.enqueue();
   object.enqueue();
   object.enqueue();
   object.display();
  
   
  
}  
   
   
   
}