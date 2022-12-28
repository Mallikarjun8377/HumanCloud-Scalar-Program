package DataStructure;

public class LinkedList {

	Node head;
	int data;
	int size;

	public LinkedList() {

	}

	public void insertAtEnd(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
			System.out.println("Element inserted succesfully!!");
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
		System.out.println("Element inserted succesfully!!");
	}

	public void insertAt(int index, int data) {
		try {
			Node node = new Node(data);
			node.data = data;
			node.next = null;

			if (index == 0) {
				insertAtStart(data);
			} else {
				Node temp = head;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				System.out.println("Element inserted succesfully!!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index selection!!");
		} catch (NullPointerException e) {
			System.out.println("Invalid Index selection!!");
		}
	}

	public void deletAt(int index) {
		try {
			if (index == 0) {
				head = head.next;
			} else {
				Node temp = head;
				Node temp1 = null;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}
				temp1 = temp.next;
				temp.next = temp1.next;
				temp1 = null;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index selection!!");
		} catch (NullPointerException e) {
			System.out.println("Invalid Index selection!!");
		}
	}

	public void deletAtStart() {
		if (head == null) {
			System.out.println("List is empty!!.Plz add elements");
		} else {
			Node node = new Node(data);
			node.next = null;
			Node temp = head;
			temp = temp.next;
			head = temp;
			System.out.println("Element deleted succesfully!!");
		}
	}

	public void deletAtEnd() {
		if (head == null) {
			System.out.println("List is empty!!.Plz add elements");
		}
		Node node = new Node(data);
		node.next = null;
		Node temp = head;
		Node ptr = temp.next;
		while (ptr.next != null) {
			temp = ptr;
			ptr = ptr.next;
		}
		temp.next = null;
		System.out.println("Element deleted succesfully!!");
	}

	public void display() {
		try {
			Node node = head;
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		} catch (NullPointerException e) {
			System.out.println("!!List is empty!!");
		}
	}

	public int size() {
		return size;
	}
}
