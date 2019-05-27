package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetLinkedHashSetTreeSet {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("b");
		set.add("c");
		set.add("a");
		System.out.println(set);

		LinkedHashSet<String> lSet = new LinkedHashSet<>();
		lSet.add("b");
		lSet.add("c");
		lSet.add("a");
		System.out.println(lSet);

		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("b");
		tSet.add("c");
		tSet.add("a");
		System.out.println(tSet);
	}
}
