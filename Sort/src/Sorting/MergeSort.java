package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	
	public static void merge(int[] arr,int start  ,int end ,int mid)
	{	
		//private static void merge(int[] arr, int start, int end, int mid) {
			int i,j,k;
			int n1=mid-start+1; //size of left array
			int n2=end-mid;     //size of rigth array
			/*generate tempary array*/
			int[] leftarr=new int[n1];
			int[] rightarr=new int[n2];
			for(i=0;i<n1;i++)
			{
				leftarr[i]=arr[start+i];
			}
			for(j=0;j<n2;j++) 
			{
				rightarr[j]=arr[mid+1+j];
			}
			i=0;
			j=0;
			k=start;
			
			while(i<n1 && j<n2) {
				if(leftarr[i]<rightarr[j]) {
					arr[k]=leftarr[i];
					i++;
					k++;
				}else {
					arr[k]=rightarr[j];
					j++;
					k++;
				}
			}
			while(i<n1) {
				arr[k]=leftarr[i];
				i++;
				k++;
			}
			while(j<n2) {
				arr[k]=rightarr[j];
				j++;
				k++;
			}
		//	System.out.println("start :"+start+" end : "+end+" mid :"+mid);
		//	System.out.println(Arrays.toString(arr));
			
		}

	
		
		
		
		
		
		
	
	
	
	
	public static void mergesort(int []arr,int start,int end)
	{
		int mid=(start+end)/2;
		if(start<end)
		{
		mergesort(arr,start,mid);
		mergesort(arr,mid+1,end);
		merge(arr,start,end,mid);
		}
		
		
		
	}

	public static void main(String[] args)
	{
		
		int[] arr= {9,4,6,2,3};
		mergesort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
}
