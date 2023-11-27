package LinkedList;

public class Singlylinearlinkedlist {

	

	class Node {
		int value;
		Node next;

		public Node(int value) {

			this.value = value;
			this.next = null;
		}

	}
	private Node head;

	public void Singlylinearlinkedlist() {

		this.head = null;
	}

	public Node gethead() {

		return head;

	}

	public void sethead(Node head) {

		this.head = head;

	}

}
