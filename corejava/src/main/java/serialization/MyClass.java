package serialization;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyClass implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer, Integer> map;

	public MyClass(List<Integer> list, Set<Integer> set, Map<Integer, Integer> map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}

	@Override
	public String toString() {
		return "MyClass [list=" + list + ", set=" + set + ", map=" + map + "]";
	}
}