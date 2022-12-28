package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem {
		
	private List<MenuItem> items = new ArrayList<>();
	private static boolean continueDisplay = true;
	private static Scanner sc = new Scanner(System.in);

	public Menu() {
		super();
	}

	public Menu(int order, String title) {
		super(order, title);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public Menu(String title) {
		super(0, title);
	}

	public void addMenuItem(MenuItem item) {
		item.setParent(this);
		items.add(item);;
	}


	public List<MenuItem> getMenuItems() {
		return items;
	}

	public void goBack() {
		if (getParent() != null) {
			getParent().display();
		} else {
			System.exit(0);
		}
	}

	public void display() {
		if (continueDisplay) {
			continueDisplay = false;
			items.forEach(e -> e.display());
			continueDisplay = true;
			System.out.println("Enter choice..#!");
			int choice = sc.nextInt();
			if (choice == 0) {
				goBack();
			} else {
				MenuItem mi = getMenuItems().stream().filter(menuItem -> menuItem.getIndex() == choice).findFirst()
						.orElse(null);
				if (mi == null) {
					System.out.println("Invalid Choice..!");
					display();
				} else if (mi instanceof Menu) {
					mi.display();
				} else {
					String operation = mi.getTitle();
					String ds = mi.getParent().getTitle();
					switch (ds) {
					case "Stack":
						stackOperations(operation);
						back();
						break;
					case "Queue":
						queueOperations(operation);
						break;
					case "Array":
						arrayOperaions(operation);
					case "LinkedList":
						linkedListOperations(operation);
						break;
					}
				}
			}
		} else {
			super.display();
		}
	}

	private void stackOperations(String operationName) {
		switch (operationName) {
		case "Push":
			System.out.println("Enter element to Push");
			MenuDrive.stack.push(sc.nextInt());
			back();
			break;
		case "Pop":
			MenuDrive.stack.pop();
			back();
			break;
		case "Peak":
			MenuDrive.stack.peak();
			back();

			break;
		default:
			System.out.println("Wrong choice");

		}

	}

	private void queueOperations(String operationName) {
		switch (operationName) {
		case "Enque":
			System.out.println("Enter element to insert");
			MenuDrive.queue.enqueue(sc.nextInt());
			back();
			break;
		case "Deque":
			MenuDrive.queue.dequeue();
			back();
			break;
		default:
			System.out.println("Wrong choice");
		}
	}

	private void arrayOperaions(String operationName) {
		switch (operationName) {
		case "Insert At":
			System.out.println("Enter element");
			MenuDrive.array.insert(sc.nextInt());
			back();
			break;
		case "InsertAtIndex":
			System.out.println("Enter index no");
			int index1 = sc.nextInt();
			System.out.println("Enter element");
			int element1 = sc.nextInt();
			MenuDrive.array.insertAt(index1, element1);
			back();
			break;
		case "DeletAtIndex":
			System.out.println("Enter Index");
			MenuDrive.array.deletAt(sc.nextInt());
			back();
			break;
		case "SearchIndex":
			System.out.println("Enter element");
			MenuDrive.array.searchIndex(sc.nextInt());
			back();
			break;

		default:
			System.out.println("Wrong choice");
		}

	}

	private void linkedListOperations(String operationName) {
		switch (operationName) {
		case "Insert":
			System.out.println("Enter index no");
			int index1 = sc.nextInt();
			System.out.println("Enter element");
			int element1 = sc.nextInt();
			MenuDrive.list.insertAt(index1, element1);
			back();
			break;
		case "Delet At":
			MenuDrive.list.deletAt(sc.nextInt());
			back();
			break;
		case "InsertAtEnd":
			System.out.println("Enter element");
			MenuDrive.list.insertAtEnd(sc.nextInt());
			back();
			break;
		case "DeletAtEnd":
			MenuDrive.list.deletAtEnd();
			back();
			break;
		case "InsertAtStart":
			System.out.println("Enter element");
			MenuDrive.list.insertAtStart(sc.nextInt());
			back();
			break;
		case "DeletAtStart":
			MenuDrive.list.deletAtStart();
			back();
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}

	}
}

	

	