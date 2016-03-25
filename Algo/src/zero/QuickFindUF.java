package zero;

public class QuickFindUF {

	private int[] id;

	/**
	 * Constructor with input array size
	 * 
	 * @param N
	 */
	public QuickFindUF(int N) {

		id = new int[N];
		// set each object to itself
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		// if values are same, then they are connected.
		return id[p] == id[q];
	}

	public void union(int p, int q) {

		int arrayValueOfP = id[p];
		int arrayValueOfQ = id[q];
		for (int i = 0; i < id.length; i++) {
			// check for all the values of P
			if (id[i] == arrayValueOfP) {
				// replace them with Q
				id[i] = arrayValueOfQ;
			}
		}

	}
}
