package MyStacks;

import java.util.Scanner;

public class IntStack
{	
	
private  int top;
private  int n;
int[]arr;

public IntStack(int n1) {

	top=-1;	
	n=n1;
	arr=new int[n];
}

	


public  void push()
{
	
	
	boolean checkfull=isstackfull(top);
	
	
	
	
	
	if(checkfull)
	{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		top++;
		if(top<arr.length)
		{
		
		arr[top]=i;
		}
		else {
			
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
		
		System.out.println(arr[top]);
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
}


