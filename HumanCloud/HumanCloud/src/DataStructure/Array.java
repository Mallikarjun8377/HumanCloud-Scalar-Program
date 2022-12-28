package DataStructure;

public class Array {

	private int arr[];
	private int count;
	private int size;

	public Array() {
		this.size = 1;
		this.count = 0;
		this.arr = new int[size];
	}

	public void insert(int data) {
		expand();
		arr[count] = data;
		count++;
		System.out.println("Element inserted succesfully!!");
	}

	private void expand() {
		if (this.size == this.count) {
			int tempArr[] = new int[size + 1];
			for (int i = 0; i < arr.length; i++) {
				tempArr[i] = arr[i];
			}
			arr = tempArr;
			size = size + 1;
		}
	}

	public void insertAt(int index, int data) {
		try {
			for (int i = arr.length; i < index; i++) {
				arr[i + 1] = arr[i];
			}
			arr[index] = data;
			count++;
			System.out.println("Element inserted succesfully!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index should be less than capacity" + "" + size);
		}
	}

	public void deletAt(int index) {
		if (index >= size) {
			System.out.println("Index should be less than capacity" + " " + size);
		} else {
			for (int i = index; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			shrink();
		}
	}

	private void shrink() {
		int tempArr[] = new int[size - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			tempArr[i] = arr[i];
		}
		arr = tempArr;
		size--;
	}

	public void searchIndex(int data) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				System.out.print("!!Element is present in array!!");
				System.out.println("Index no is - " + " " + i);
				temp = temp + 1;
			}
		}
		if (temp > 0) {

		} else {
			System.out.println("!!Element is not present in array!!");
		}
	}

	public void display() {
		for (int ca : arr) {
			System.out.print(ca + " ");
		}
		System.out.println("");
	}
}
