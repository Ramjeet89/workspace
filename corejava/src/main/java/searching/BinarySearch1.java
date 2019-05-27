package searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch1 {

	public int runBinarySearchUsingJavaCollections(List<Integer> sortedList, Integer key) {

		int index = Collections.binarySearch(sortedList, key);
		return index;
	}

	public static void main(String[] args) {
		Integer[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
		int key = 6;

		BinarySearch1 binarySearch1 = new BinarySearch1();
		int index1 = binarySearch1.runBinarySearchUsingJavaCollections(Arrays.asList(sortedArray), key);
		System.out.println("Search element found in location index : " + index1);
	}
}
