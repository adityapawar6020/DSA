import java.util.Scanner;

public class BinarySearch {
	
  static int BSearch(int[] arr,int First,int Last,int search)
	  {
		  
		  
		  if(First>Last)
		  {
			  return -1;
		  
		  }
		  
		  else
		  {
			  int mid=(First+Last)/2;
			  
			  if(mid==search)
			  {
				return mid;  
			  
			  }
			  else if(search<mid)
			  {
				 Last=mid-1; 
				 return BSearch(arr,First,Last,search) ; 
			  }
			  else
			  {
				  First=mid+1;
				  return BSearch(arr,First,Last,search) ;
			  }
			  
		  
		  }
		  
		  
	  
		  
	  }
	
	public static void main(String[] args) {
		
		
		int n;
		System.out.println("enter length");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();	
		
		int[] arr=new int[n];
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter  "+(i+1)+"   element" );
			arr[i]=sc.nextInt();
			
		}
		
		int search;
		System.out.println("enter number you want to search");

		search=sc.nextInt();
		
		int j=BSearch(arr,arr[0],arr.length-1,search);
		if(j!=1)
			System.out.println("number is present");
		else
			System.out.println("number is not present");
		
		
		
		
	}
	

}
