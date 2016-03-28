package sort;

public class Quicksort {

	public static void sort(Comparable<Comparable>[] a) {
		// Do a random shuffle before quick sort
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable<Comparable>[] a, int lo, int hi) {
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);

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

			if (i >= j)
				break; // if check cannt be used in place of while true bec last exch will happen
			SortingUtil.exch(a, i, j);
		}
		SortingUtil.exch(a, lo, j);
		return j;
	}

}
