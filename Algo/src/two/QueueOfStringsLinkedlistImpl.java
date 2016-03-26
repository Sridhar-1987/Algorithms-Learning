package two;

public class QueueOfStringsLinkedlistImpl {

	// Need two ref since queue uses both the ends
	private Node first = null;

	private Node last = null;

	private class Node {
		String item;
		Node next;
	}

	/**
	 * Same as pop of stack
	 * 
	 * @return
	 */
	String dequeue() {
		Node oldFirst = first;

		first = oldFirst.next;

		if (isEmpty())
			last = null;

		return oldFirst.item;
	}

	void enqueue(String newItem) {
		Node oldLast = last;

		last = new Node();
		last.item = newItem;
		last.next = null; // implicit

		if (isEmpty())
			first = last;
		else
			oldLast.next = last;

	}

	public boolean isEmpty() {
		return first == null;
	}
}
