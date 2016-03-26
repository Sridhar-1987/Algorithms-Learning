package zero;

public class QuickUnionUF {

	private int[] id;

	public QuickUnionUF(int N) {
		id = new int[N];
		// set each object to itself
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}

	}

	public int root(int k) {
		// iterate till root is found
		while (id[k] != k) {
			// set k with parent's value
			k = id[k];
		}
		return k;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int rootOfP = root(p);
		int rootOfQ = root(q);
		// we dont care if they have the same root
		id[rootOfP] = rootOfQ;
	}

}
