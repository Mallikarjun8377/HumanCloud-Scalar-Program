package DataStructure;

public class MenuDrive {
	public static final Stack stack = new Stack();
	public static final Queue queue = new Queue();
	public static final Array array = new Array();
	public static final LinkedList list = new LinkedList();

	public static void main(String[] args) {

		Menu mainMenu = new Menu("DataStrucure");
		Menu stackMenu = new Menu(1, "Stack");
		Menu queueMenu = new Menu(2, "Queue");
		Menu arrayMenu = new Menu(3, "Array");
		Menu listMenu = new Menu(4, "LinkedList");

		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(arrayMenu);
		mainMenu.addMenuItem(listMenu);

		stackMenu.addMenuItem(new MenuItem(1, "Push"));
		stackMenu.addMenuItem(new MenuItem(2, "Pop"));
		stackMenu.addMenuItem(new MenuItem(3, "Peak"));

		queueMenu.addMenuItem(new MenuItem(1, "Enque"));
		queueMenu.addMenuItem(new MenuItem(2, "Deque"));

		arrayMenu.addMenuItem(new MenuItem(1, "Insert At"));
		arrayMenu.addMenuItem(new MenuItem(2, "InsertAtIndex"));
		arrayMenu.addMenuItem(new MenuItem(3, "DeletAtIndex"));
		arrayMenu.addMenuItem(new MenuItem(4, "SearchIndex"));

		listMenu.addMenuItem(new MenuItem(1, "Insert"));
		listMenu.addMenuItem(new MenuItem(2, "Delet At"));
		listMenu.addMenuItem(new MenuItem(3, "InsertAtEnd"));
		listMenu.addMenuItem(new MenuItem(4, "DeletAtEnd"));
		listMenu.addMenuItem(new MenuItem(5, "InsertAtStart"));
		listMenu.addMenuItem(new MenuItem(6, "DeletAtStart"));

		mainMenu.display();

	}

}
