package DataStructure;

import java.util.Scanner;

public class SwitchConsole {

	public static void main(String[] args) {

		Stack stack = new Stack();
		Queue queue = new Queue();
		Array array = new Array();
		LinkedList list = new LinkedList();

		
		String str;
		do {
			System.out.println("**DataStructure**");
			System.out.println("1.Stack");
			System.out.println("2.Queue");
			System.out.println("3.Array");
			System.out.println("4.LinkedList");
			System.out.println("Enter your choice here");
			try (Scanner sc = new Scanner(System.in)) {
				int choice;
				choice = sc.nextInt();
				switch (choice)

				{
				case 1:
					int stk;
					do {
						System.out.println("**Stack**");
						System.out.println("1.Push");
						System.out.println("2.Pop");
						System.out.println("3.Peak");
						System.out.println("4.Display");
						System.out.println("Enter your choice here");
						stk = sc.nextInt();
						switch (stk) {
						case 1:
							System.out.println("Enter element to Push");
							stk = sc.nextInt();
							stack.push(stk);
							stack.display();
							break;
						case 2:
							stack.pop();
							stack.display();
							break;
						case 3:
								stack.peak();						
							break;
						case 4:
							System.out.println("!!Your updated stack!!");
							stack.display();
							break;
						default:
							System.out.println("Wrong choice");
						}
						System.out.println("");
						System.out.println("0.Back");
						System.out.println("1.Exit");
						str = sc.next();
					} while (str.equalsIgnoreCase("0")); {
					System.out.println("Thank you!!");
				}
					break;
				case 2:
					int que;
					do {
						System.out.println("**Queue**");
						System.out.println("1.Enque");
						System.out.println("2.Deque");
						System.out.println("3.Display");
						System.out.println("Enter your choice here");
						que = sc.nextInt();
						switch (que) {
						case 1:
							System.out.println("Enter element to insert");
							que=sc.nextInt();
							queue.enqueue(que);
							break;
						case 2:
						    queue.dequeue();
							queue.display();
							
							break;
						case 3:
							System.out.println("!!Your Updated Queue!!");
							queue.display();
							break;
						default:
							System.out.println("Wrong choice");
						}
						System.out.println("");
						System.out.println("0.Back");
						System.out.println("1.Exit");
						str = sc.next();
					} while (str.equalsIgnoreCase("0")); {
					System.out.println("Thank you!!");
				}
					break;
				case 3:
					int arr;
					do {
						System.out.println("**Array**");
						System.out.println("0.Back");
						System.out.println("1.Insert");
						System.out.println("2.InsertAtIndex");
						System.out.println("3.DeletAtIndex");
						System.out.println("4.Search Index");
						System.out.println("5.Display");
						System.out.println("Enter your choice here");
						arr = sc.nextInt();
						switch (arr) {
						case 0:
							System.out.println("");
							break;
						case 1:
							System.out.println("Enter element");
							arr=sc.nextInt();
							array.insert(arr);
							array.display();
							break;
						case 2:
							System.out.println("Enter index no");
							int index1 = sc.nextInt();
							System.out.println("Enter element");
							int element1 = sc.nextInt();
							array.insertAt(index1, element1);
							array.display();
							break;
						case 3:
							System.out.println("Enter Index");
							arr= sc.nextInt();
							array.deletAt(arr);
							array.display();
							break;
						case 4:
							System.out.println("Enter element");
							arr = sc.nextInt();
							array.searchIndex(arr);
							break;
						
						case 5:
							System.out.println("!!Current element's in Array!!");
							array.display();
							break;
						default:
							System.out.println("Wrong choice");
						}
						System.out.println("");
						System.out.println("0.Back");
						System.out.println("1.Exit");
						str = sc.next();
					} while (str.equalsIgnoreCase("0")); {
					System.out.println("Thank you!!");
				}
					break;
				case 4:
					int LinkL;
					do {
						System.out.println("**LinkedList**");
						System.out.println("0.Back");
						System.out.println("1.Insert At");
						System.out.println("2.Delet At");
						System.out.println("3.InsertAtEnd");
						System.out.println("4.DeletAtEnd");
						System.out.println("5.InsertAtStart");
						System.out.println("6.DeletAtStart");
						System.out.println("7.Display");
						System.out.println("Enter your choice here");
						LinkL = sc.nextInt();
						switch (LinkL) {
						case 0:
							System.out.println("");
							break;
						case 1:
							System.out.println("Enter index no");
							int index1 = sc.nextInt();
							System.out.println("Enter element");
							int element1 = sc.nextInt();
							list.insertAt(index1, element1);					
							list.display();
							break;
						case 2:
							list.deletAt(LinkL);
							LinkL = sc.nextInt();
							list.display();
							break;
						case 3:
							System.out.println("Enter element");
							LinkL = sc.nextInt();
							list.insertAtEnd(LinkL);
							list.display();
							break;
						case 4:
							list.deletAtEnd();
							LinkL = sc.nextInt();
							list.display();
							break;
						case 5:
							System.out.println("Enter element");
							LinkL = sc.nextInt();
							list.insertAtStart(LinkL);
							list.display();
							break;
						case 6:
							list.deletAtStart();
							list.display();
							break;
						case 7:
							System.out.println("!!Current element's in LinkedList!!");
							list.display();
							break;
						default:
							System.out.println("Wrong choice");
							break;
						}
						System.out.println("");
						System.out.println("0.Back");
						System.out.println("1.Exit");
						str = sc.next();
					} while (str.equalsIgnoreCase("0")); {
					System.out.println("Thank you!!");
				}

				default:
					System.out.println("Wrong choice");
					break;
				}
				System.out.println("Do you want to use dataStructure? y/n");
				str = sc.next();
			}

		} while (str.equalsIgnoreCase("y"));
		{
			System.out.println("Thank you!!");
		}
	}

}
