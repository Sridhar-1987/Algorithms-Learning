package sort;

public class SortingUtil {

	public static boolean less(Comparable<Comparable> i,
			Comparable<Comparable> j) {
		return i.compareTo(j) < 0;
	}

	public static void exch(Comparable<Comparable>[] array, int i, int j) {
		Comparable swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
}
