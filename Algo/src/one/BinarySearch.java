package one;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Assumption Array is sorted
	 * 
	 * @param sortedArray
	 * @param k
	 * @return
	 */
	public static int binarySearch(int[] sortedArray, int k) {
		int lo = 0;
		int hi = sortedArray.length - 1;

		while (lo <= hi) {
			int mid = lo + ((hi - lo) / 2);

			// mid greater than key -> change hi to mid-1
			if (sortedArray[mid] > k) {
				hi = mid - 1;
			}
			// mid smaller than key -> change lo to mid+1
			else if (sortedArray[mid] < k) {
				lo = mid + 1;
			}
			// sortedArray[mid] == k
			else {
				return mid;
			}
		}
		// lo is equal to hi and element is not found
		return -1;
	}
}
