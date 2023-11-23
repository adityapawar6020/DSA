package Sorting;

import java.util.Arrays;

public class InsertionSort2 {
	
	
	
	public static void selectionsort(int[] arr)
	{	
		for (int i = 1; i < arr.length; i++)
		{
			int key=arr[i];
			System.out.println("key is"+key);
			int j =i-1;
			
			for ( ;  j>=0 && arr[j]>key; j--)
			{
				
			//	System.out.println("in this loop");
				
			    arr[j+1]=arr[j];
				 
				 		
				
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
		
	}
	public static void main(String[] args) {
		 int[] arr= {15,7,3,12,20};
		 System.out.println("our array");
		 System.out.println(Arrays.toString(arr));
		 selectionsort(arr);
	}

}
