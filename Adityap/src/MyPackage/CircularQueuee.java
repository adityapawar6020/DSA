package MyPackage;

import java.util.Scanner;

public class CircularQueuee {
	Scanner sc = new Scanner(System.in);

	private int rear;
	private int front;
	private int[] arr;
	private int n;

	public CircularQueuee(int n) {
		this.n = n;
		arr = new int[n];
		front = -1;
		rear = -1;
	}

	public void enqueue() {

		if (isfull()) {
			System.out.println("queue is aldready full");
		} else {
			if(front==-1) {
				front=0;
			}
			rear = (rear + 1) % n;
			System.out.println("ENTER NUMBER ");
			int n = sc.nextInt();
			arr[rear] = n;
		}

	}

	public void dequeue() {
		boolean flag1 = isempty();

		if (flag1) {
			if(front==n-1)
			{
					System.out.println(arr[front]);
					front = -1;
					rear = -1;
					
			}
			else
				System.out.println("queue is aldredy empty");
			
		} else {
			System.out.println(arr[front]);
			front = (front + 1) % n;

			

		}
	}

	public boolean isfull() {

		if (rear == n - 1 && front==0)
		{
			return true;
		}
		return false;
	}

	public boolean isempty() {
		if (front == -1 || front == rear) {
			return true;
		}

		return false;
	}

}
