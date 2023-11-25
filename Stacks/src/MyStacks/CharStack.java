package MyStacks;

import java.util.Scanner;

public class CharStack {

	private  int top;
	private  int n;
	char[] arr;
	
	
	
	 public  char getvalueattopofstackarray()
	{
		 
		 
		char at=arr[top]; 
		return at ;
		
		
	}
	
	public CharStack(int n1) {

		top=-1;	
		n=n1;
		arr=new char[n];
	}

		


	public  void push(char k)
	{
		
	 boolean checkfull=isstackfull(top);
			
		
		if(checkfull)
		{
			
//			System.out.println("enter char");
//			Scanner sc=new Scanner(System.in);
//			String i=sc.next();
			
			top++;
			if(top<arr.length)
			{
			
			arr[top]=k;
			System.out.println("element is pusshed successfully  "+ arr[top]);
			
			}
			else
			{
				
				 System.out.println("array is full");
			}
		
			
		}
	 
		else 
		{	
		System.out.println("Stack is aldready full");
		
		}
		
		
	}

	public  void pop() {
		
		
		boolean checkempty=isstackempty(top);
		
		if(checkempty)
		{
			
			//System.out.println(arr[top]);
			System.out.println("element poped successfully  "+arr[top]);
			top--;
		}
		else
		{
			System.out.println("stack is aldready empty");
		
		}
	}

	public  boolean isstackfull(int topvalue) {
			
	    if(topvalue==arr.length)
	    {
	    	return false;//because stack is already full
	    }
		
	    else
	    	{return true;}
	}

		
	public  boolean isstackempty(int topkivalue)
	{
		if(top==-1)
		{
			return false; //because stack is already empty
		}
		
		else
		{
		if(top==n)
		{
			top--;
			return true;
		}
		
		else
		{   
			return true;
		}
		
	}
	}

	public int gettop() {
		// TODO Auto-generated method stub
		return top;
	}
}
