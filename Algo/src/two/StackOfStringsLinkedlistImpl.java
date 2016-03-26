package two;

public class StackOfStringsLinkedlistImpl {

	private Node first = null;

	private class Node {
		String item;
		Node next;
	}

	void push(String item) {
		// Keep reference of oldFirst
		Node oldFirst = first;

		Node newFirst = new Node();
		newFirst.item = item;
		newFirst.next = oldFirst;
	}

	String pop() {
		Node oldFirst = first;
		first = first.next;
		return oldFirst.item;
	}

}
