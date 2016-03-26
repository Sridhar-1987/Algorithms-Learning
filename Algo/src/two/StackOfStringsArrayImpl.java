package two;

public class StackOfStringsArrayImpl {

	private String[] stringArray;

	// N is size of array as well as Next available index in the array
	private int N = 0;

	public StackOfStringsArrayImpl(int capacity) {
		// TODO Auto-generated constructor stub
	}
	
	boolean isEmpty(){
		return N== 0;
	}
	
	String pop(){
		// loitering issue is not handled. null out
		return stringArray[--N];
	}

	void push(String newStr ){
		stringArray[N++] = newStr;
	}
}
