package sort;

/**
 * Quick select select the item in kth index in an array. Not a sort
 */
public class Selection {

	public static Comparable select(Comparable<Comparable>[] a, int k) {

		// Do random shuffle
		int lo = 0;
		int hi = a.length - 1;
		while (lo < hi) {
			int j = partition(a, 0, a.length - 1);
			if (j < k)
				lo = j + 1;
			else if (j > k)
				hi = j - 1;
			else
				return a[k];
		}
		return a[k];
	}

	private static int partition(Comparable<Comparable>[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		while (true) {
			while (SortingUtil.less(a[++i], a[lo])) {
				if (i == hi) {
					break;
				}
			}

			while (SortingUtil.less(a[lo], a[++j])) {
				if (j == lo) {
					break;
				}
			}

			if (i >= j) {
				break;
			}
			SortingUtil.exch(a, i, j);
		}
		SortingUtil.exch(a, lo, j);
		return j;
	}

}
