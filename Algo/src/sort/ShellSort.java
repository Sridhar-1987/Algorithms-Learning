package sort;

// similar to Insertion sort (replace 1 with h)
public class ShellSort {

	public static void sort(Comparable<Comparable>[] a) {

		int N = a.length;

		int h = 1;
		while (h < N / 3) {
			h = 3 * h + 1; // 3x+1
		}
		while (h >= 1) {
			for (int i = 0; i < N; i++) {

				for (int j = i; j >= h; j = j - h) {
					if (SortingUtil.less(a[j], a[j - h])) {
						SortingUtil.exch(a, j, j - 1);
					} else {
						break;
					}
				}
			}
			h = h / 3;
		}

	}

}
