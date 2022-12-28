package DataStructure;

public class Stack {

	Node head;
	int size;

	Stack() {
		head = null;
	}

	void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		size++;
		head = temp;
		System.out.println("Element inserted succesfully!!");

	}

	void peak() {
		if (head != null) {
			System.out.println("Current element is-" + "  " + head.data);
		} else {
			System.out.println("!!Stack is empty!!");
		}
	}

	int pop() {
		if (head != null) {
			int result = head.data;
			head = head.next;
			size--;
			System.out.println("Element deleted successfully!!");
			return result;
		} else {
			System.out.println("!!Stack is empty!!");
		}
		return size;
	}

	int size() {
		return size;
	}

	public void display() {
		Node current = head;
		if (current == null) {
			System.out.println("!!Stack is empty!!");
		}
		while (current != null) {
			System.out.print(" " + current.data);
			current = current.next;

		}

	}

}
