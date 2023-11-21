import java.util.Scanner;

public class BinarySearch2 {

	static int Bsearch(int[] arr,int First, int Last, int search)
	{
		
		
		
		return search;
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int size;
		System.out.println("enter the lengh if array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int [] arr=new int [size];
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+(i+1)+" element");
			arr[i]=sc.nextInt();
		}
		
		int search;
		System.out.println("enter number you want to search");
		search=sc.nextInt();
		int j=Bsearch(arr,arr[0],arr.length-1,search);
		if(j!=1)
			System.out.println("number is present ");
		else
			System.out.println("number is not present");
	}
	
	

}
