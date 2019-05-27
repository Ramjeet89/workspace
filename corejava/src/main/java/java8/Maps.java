package java8;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<String, Object> obj = new HashMap<>();
		obj.put("A", new Integer(1));
		obj.put("B", new Integer(2));
		obj.put("C", new Integer(3));
		System.out.println(obj);
	}
}
