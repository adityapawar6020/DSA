package sum;

import java.util.Scanner;

public class sumofnnumbers {
	
	static int cnt=0;
	
	public static int sum(int[] arr,int n)
	{
		
		if(arr[n]<1)
			return 0;
		if(arr[n]==1)
			return 1;
		
		cnt++;
		
		
		return arr[n]+sum(arr,n-1);
		

		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("enter size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++)
		{
			
			arr[i]=i+1;  
			
		}
		
		int j=sum(arr,arr.length-1);  
		
		System.out.println("Addition is "+j);
		System.out.println("rec is called  "+ cnt+"  times");
		
		
	}

}
