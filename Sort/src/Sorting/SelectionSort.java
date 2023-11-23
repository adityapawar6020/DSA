package Sorting;

import java.util.Arrays;

public class SelectionSort {
	




	public static void selectionsort(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("we are in "+(i+1)+"iteration");
			
			int min=i;
			
			for(int j=i+1;j<arr.length;j++)
				
			if(arr[min]>arr[j])
			{
				int temp=arr[min];
				arr[min]=arr[j];
				arr[j]=temp;
				
				System.out.println(Arrays.toString(arr));
			}
			
		}		
	}
}
		
		