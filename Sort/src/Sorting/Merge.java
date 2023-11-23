package Sorting;

import java.util.Arrays;

public class Merge {
	public static int i;
	public static int j;
	public static int k;
	
	public static void merge(int[] arr1,int[] arr2,int[] arr3)
	{
        int i=0;
        int j=0;
        int k=0;
		while(i<arr1.length && j<arr2.length)
		{
			
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
				
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
				k++;
				
			}
			
	}	
		while(i<arr1.length)
		
		{
			arr3[k]=arr1[i];
			i++;
			k++;

			
		
		}
		
		
		while(j<arr2.length)
			
		{
			arr3[k]=arr2[j];			
			k++;
			j++;
		}
		
		
		System.out.println(Arrays.toString(arr3));
		
		}
			
			
	
		
		
		
	
	
	public static void main(String[] args) 
	{
		
		
		
		int[] i= {1,3,5,8,10,14 };
		int[] j= {2,4,6,7,12,13,17};
		
		int[]k=new int[(i.length+j.length)];
//		System.out.println(i.length);
//		System.out.println(j.length);
//		System.out.println(k.length);
		
		merge(i,j,k);
		
		
		
		
	}

}
