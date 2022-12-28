package DataStructure;

public class Queue {

	Node front, rear;
	int size;
	int data;

	Queue() {
	}

	void enqueue(int data) {
		Node newNode = new Node(data);
		if (rear == null) {
			rear = front = newNode;
			System.out.println("Element inserted succesfully!!" + "  " + "**Updated Queue**");
		}
		rear.next = newNode;
		rear = newNode;
	}

	int dequeue() {
		if (front != null) {
			int result = front.data;
			front = front.next;
			System.out.println("Element deleted successfully!!" + "  " + "**Upadated Queue!!");
			return result;
		} else {
			System.out.println("Queue is empty");
		}
		return size;

	}

	public void display() {
		Node current = front;
		if (current == null) {
			System.out.println("!! Queue is empty!!");
		}
		while (current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
		System.out.println(" ");
	}
}
