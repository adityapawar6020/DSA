package MyStacks;

import java.util.Scanner;

public class TestIntStack {

	public static void main(String[] args) {
		
		
		System.out.println("enter array length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		IntStack ob=new IntStack(n);
	
		
		//THIS IS RIGHT
//		for(int i=0;i<n;i++)
//		{
//		  ob.push();
//		}
//		ob.push();
//
//		
//		for(int j=n-1 ;j>-1 ;j--)
//		
//			
//		{
//	     	ob.pop();
//        }
//		ob.pop();		
		
		
		ob.push();
		ob.push();
		ob.pop();
		ob.pop();
		ob.pop();
		
			
			
		}
		
}

