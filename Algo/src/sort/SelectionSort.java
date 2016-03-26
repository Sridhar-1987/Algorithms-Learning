package sort;

public class SelectionSort {

	public static void sort(Comparable<Comparable>[] a) {
		int N = a.length;
		// Iterate through the full array
		for (int i = 0; i < N; i++) {
			// initialise the min
			int min = i;
			// Iterate through rest of elements to find the minimum
			for (int j = i + 1; j < N; j++) {
				if (SortingUtil.less(a[j], a[min])) {
					min = j;
				}
			}
		}

	}
}
