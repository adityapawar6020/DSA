package LinkedList;

import java.util.Scanner;

import LinkedList.Singlylinearlinkedlist.Node;

public class ServiceSinglylinkedlist {
	Scanner sc = new Scanner(System.in);
	Singlylinearlinkedlist sob = new Singlylinearlinkedlist();
	

	public void addfirst() {

		System.out.println("enter value");	
		int value = sc.nextInt();
		
		
		Singlylinearlinkedlist.Node newnode = sob.new Node(value);

		if (sob.gethead() != null) {
			newnode.next = sob.gethead();
		} else {
			newnode.next = sob.gethead();
			sob.sethead(newnode);
		}

	}
		
	public void addLast() {

		System.out.println("enter value");	
		int value = sc.nextInt();
		
		Singlylinearlinkedlist.Node newnode = sob.new Node(value);
		
		Singlylinearlinkedlist.Node temp;
		temp=sob.gethead();
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;	

	}
	
	public void addspecificpos(int pos) {

		System.out.println("enter value");	
		int value = sc.nextInt();
		
		Singlylinearlinkedlist.Node newnode = sob.new Node(value);
		
		Singlylinearlinkedlist.Node temp;
		temp=sob.gethead();
		for(int i=1; i<= pos-2;i++)
		{
			temp=temp.next;
		}
		
		newnode.next=temp.next;
		temp.next=newnode;
		
	}
	
	public void display()
	{
		Singlylinearlinkedlist.Node temp;
		temp=sob.gethead();
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}		
	}
	
	public void deletefirst()
	{
		Node temp;
		temp=sob.gethead();
	    sob.sethead(temp.next);
		temp=null;
		
		
	}
	public void deletelast()
	{
		Node previous=sob.gethead();
		Node current=previous.next;
		while(current.next!=null)
		{
			current=current.next;
			previous=previous.next;
		}
		
		previous.next=null;
		current=null;
	}
	public void deletespecific(int pos)
	{
		Node temp=sob.gethead();
		Node del=temp.next;
		for(int i=1;i<=pos-2;i++)
		{
			temp=temp.next;
			del=del.next;
		}
		
		temp.next=temp.next.next;
		del.next=null;
	}
		
    public void deletebyval(int value)
    
    {
    	Node prev=sob.gethead();
    	Node current= prev.next;
    	
    	if(prev.value==value)
    	{
    		sob.sethead(current.next);
    		prev=null;
    	}
    	else {
			while (current.value != value)
			{
    		    if(current.next==null)
    		    	break;
				prev=prev.next;
				current=current.next;
				
			}

			prev.next=current.next;
			current=null;
    	}
    	
    	
    	
    }
		
	
	
	

}
