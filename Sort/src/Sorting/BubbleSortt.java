package Sorting;

import java.util.Arrays;

public class BubbleSortt {
	
	public static int j;
	
	public static void  bs(int []arr)
	{	int cnt=0;
		for(int i=0;i<arr.length;i++)
			
		
	{
			
		System.out.println("we are in   "+(i+1)+"   iteration");	
		for( j=0;j<arr.length-i-1;j++)
		{
			cnt++;
		if(arr[j]>arr[j+1])		
			
	//evdha lakshat thev ki bubble sort chya case madhe 
	//asc madhe pahije asel tar largest element last la
	//jato first iteration madhe second largest second
	//last la second iteration madhe
		{  
		   int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			
		}
	
		System.out.println(Arrays.toString(arr));
		
		}
		
		System.out.println("output after   "+(i+1)+"   iteration");
		
		System.out.println(Arrays.toString(arr));
		
	
	}
		System.out.println(cnt);
		
	};
	
	
	
	public static void main(String[] args) {
		
		int []arr= {1,2,3,8,5,9,4};
		//int []arr= {8,1,12,9,7,5,-1};
		System.out.println("this is og");
		System.out.println(Arrays.toString(arr));
		System.out.println("now lets start");
		bs(arr);
		
		
	}
	
	
}
