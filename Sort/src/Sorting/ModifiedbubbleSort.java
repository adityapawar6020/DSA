		
	package Sorting;

	import java.util.Arrays;

	public class ModifiedbubbleSort {
		
		public static boolean flag=true;
	
		public static int cnt;
		public static int j;
		
		public static void  bs(int []arr)
		
		{	
		  
			for(int i=0;i<arr.length;i++)
				
		{
			if(flag==true)
				
			{
				System.out.println("we are in   "+(i+1)+"   iteration");	
			
			for( j=0;j<arr.length-i-1;j++)
			{
				cnt++;
			if(arr[j]>arr[j+1])		

			{ 
			   int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
				
			}
			else
			{
			flag=false;
			}
		
			System.out.println(Arrays.toString(arr));
			
			}
			
			System.out.println("output after   "+(i+1)+"   iteration");
			
			System.out.println(Arrays.toString(arr));
			
		
		}
			
			
		}
			
		};
		
		
		
		public static void main(String[] args) {
			
		int []arr= {1,2,3,8,5,9,4};
		//	int []arr= {8,1,12,9,7,5,-1};
			System.out.println("this is og");
			System.out.println(Arrays.toString(arr));
			System.out.println("now lets start");
			bs(arr);
			System.out.println(cnt);
			
			
		}
		
		
	}



