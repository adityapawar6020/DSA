package MyPackage;

public class Singlylinearlinkedlist {
	
	
	private  Node head;
	
	
	
	class Node
	{
		int value;
		Node next;
		
		public Node(int value) {
			
			this.value = value;
			this.next=null;
		}
		
		
	}
	
	

	

	
	
	public Singlylinearlinkedlist() {
		super();
		this.head = null;
	}


	public Node gethead()
	{
		
		return head;
		
	}
	public void sethead(Node head)
	{
		
	  this.head=head;
		
	}
	
	

	
	
	
}
