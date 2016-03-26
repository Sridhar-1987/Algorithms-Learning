package sort;

/**
 * Good for partially sorted array
 *
 */
public class InsertionSort {

	public static void sort(Comparable<Comparable>[] a) {

		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (SortingUtil.less(a[j], a[j - 1])) {
					SortingUtil.exch(a, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

}
