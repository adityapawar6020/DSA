package LinkedList;

public class Test {

	public static void main(String[] args) {

		ServiceSinglylinkedlist objectt = new ServiceSinglylinkedlist();

		objectt.addfirst();
		objectt.addspecificpos(2);
		objectt.addspecificpos(3);
		objectt.addspecificpos(4);
		objectt.addLast();
		System.out.println("display");
		objectt.display();
		objectt.deletefirst();
		System.out.println("display");
		objectt.display();
		objectt.deletespecific(4);
		System.out.println("display");
		objectt.display();
        objectt.deletelast();
		System.out.println("display");
		objectt.display();
        
        objectt.deletebyval(69);
        System.out.println("display");
        objectt.display();

	}

}
