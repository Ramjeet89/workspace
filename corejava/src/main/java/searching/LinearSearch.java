package searching;

public class LinearSearch {

	public static final int unorderedLinearSearch(int value, int[] array) {
		for (int i = 0; i < array.length; i++) {
			int iValue = array[i];
			if (value == iValue) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}

	public static final int orderedLinerSearch(int value, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				return i;
			} else if (array[i] > value) {
				return -1;
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 9, 9, 0 };
		int shouldBeFound = 9;
		int atIndex = LinearSearch.unorderedLinearSearch(shouldBeFound, integers);

		System.out.println(String.format("Should be found: %d. Found %d at index %d. An array length %d", shouldBeFound,
				integers[atIndex], atIndex, integers.length));

		int[] sortedArray = { 10, 2, 30, 40, 50 };
		int key = 30;
		atIndex = LinearSearch.orderedLinerSearch(key, sortedArray);
		System.out.println(String.format("Should be found: %d. Found %d at index %d. An array length %d", key,
				sortedArray[atIndex], atIndex, sortedArray.length));

	}
}
