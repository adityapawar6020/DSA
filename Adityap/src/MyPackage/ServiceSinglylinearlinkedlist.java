package MyPackage;

import java.util.Scanner;

public class ServiceSinglylinearlinkedlist {
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
		while(temp.next!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
		
		
	}
	
	
	
}
