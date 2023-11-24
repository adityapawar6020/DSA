package Sorting;

import java.util.Arrays;

public class QuickSort {
	
	
	
	public static int Pivot;
	public static int temp;
	public static int i;
	public static int j;
	public static int P; 
	
	
	public static void QuickSort(int[]arr,int start ,int end)
	{
         if(start<end)
		{
			int P=Partition(arr,start,end); 
			QuickSort(arr,start,P-1 );
			QuickSort(arr,P+1,arr.length-1);
				
		}
         
	
	}
	
	public static int Partition(int[] arr, int start, int end) {
		
		
		int Pivot=start;
		int i=start;
		int j=end;
		
		
		
	while(i<j)
	{
		
 	while(arr[i]<=arr[Pivot] && i<arr.length-1)
		{
			i++;
			
		}
		System.out.println("i is"+i);

		
		while(arr[j]>=arr[Pivot] && j>0)
		{
            j--;	 
         
		}
		   System.out.println("j is"+j);
		   
		   
		if(j<i)
		{
			System.out.println("in j is less than i");
			temp=arr[Pivot];
			arr[Pivot]=arr[j];
			arr[j]=temp;
			
		}
		
		if(j>i)
		{
			temp=arr[j];
			System.out.println(temp);
			arr[j]=arr[i];
			arr[i]=temp;
			
		 } 
	}
             return j;
		
	


	}
	public static void main(String[] args) {
		
		int arr[]= { 10,5,60,71,15,65,20};
		System.out.println("our array");
		System.out.println(Arrays.toString(arr));
		System.out.println("lets start quick sort");
     	QuickSort(arr,0,arr.length-1);
     	System.out.println(Arrays.toString(arr));
		
	}

}
