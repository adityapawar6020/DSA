package Sorting;

import java.util.Arrays;

public class HeapSortt
{
    public static void HeapSort(int[] arr)
    {
        int m=arr.length;
    	
       
        for(int j=(m/2-1) ;j>=0 ;j--)
        {
        	heapify(arr,m,j);
        }
        //   System.out.println(Arrays.toString(arr));
       
        

      for(int i=m-1;i>=0;i--)
      {
        	int temp=arr[0];
        	arr[0]=arr[i];
        	arr[i]=temp;
         	System.out.println(Arrays.toString(arr));
        	//hi line imp ahe
        	heapify(arr,i,0);
        	
       }
     //   System.out.println(Arrays.toString(arr));
    	
    }
    
    
    public static void heapify(int[] arr,int length,int i)
    
    
    {
    	if((2*i+1)<length && arr[i]<arr[(2*i+1)])  //left
    		
    	{
    		int temp=arr[i];
    		arr[i]=arr[(2*i+1)];
    		arr[(2*i+1)]=temp;
    		
    		heapify(arr,length,2*i+1);
    		
    	}
    	
    	if((2*i+2)<length && arr[i]<arr[(2*i+2)]) //right
    	{

    		int temp=arr[i];
    		arr[i]=arr[(2*i+2)];
    		arr[(2*i+2)]=temp;
    		heapify(arr,length,2*i+2);
    		
    	}
  	  	
    	
    }
	
	
	
	public static void main(String[] args) {
		
		int[]arr= {5,7,3,10,12,4};
		
		System.out.println(Arrays.toString(arr));
		HeapSort(arr);
		//System.out.println(Arrays.toString(arr));
		
		
		
	}
	


}  