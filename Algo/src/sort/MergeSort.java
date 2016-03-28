package sort;

public class MergeSort {
	// Top down

	private static void merge(Comparable<Comparable>[] a,
			Comparable<Comparable>[] aux, int lo, int mid, int hi) {
		// precondition is i to mid in aux is sorted and mid+1 to j is sorted
		// copy contents of a into aux
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		int i = lo;
		int j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) { // boundary condition
				a[k] = aux[j++];
			} else if (j > hi) { // boundary condition
				a[k] = aux[i++];
			} else if (SortingUtil.less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

	private static void sort(Comparable<Comparable>[] a,
			Comparable<Comparable>[] aux, int lo, int hi) {
		if (hi <= lo)
			return; // check boundary value
		int mid = lo + (hi - lo) / 2; // calculate the mid
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	public static void sort(Comparable<Comparable>[] a) {

		Comparable<Comparable>[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);

	}
	
	public static void sortBU(Comparable<Comparable>[] a){
		
		int N = a.length;
		Comparable<Comparable>[] aux = new Comparable[a.length];
		for(int sz = 1; sz < N; sz= sz+sz){
			for(int lo = 0;lo < N-sz; lo+=sz+sz){
				merge(a,aux,lo,lo+sz-1, Math.min(lo+sz+sz-1, N-1));
			}
		}
		
		
	}
}
