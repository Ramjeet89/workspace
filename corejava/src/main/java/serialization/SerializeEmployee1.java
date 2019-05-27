package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SerializeEmployee1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		Set<Integer> set = new HashSet<Integer>();
		set.add(4);
		set.add(5);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(6, 34);
		map.put(7, 35);

		MyClass object1 = new MyClass(list, set, map);

		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, serializing objects...");
			oout.writeObject(object1);
			fout.close();
			oout.close();
			System.out.println("Object Serialization completed.");

			// DeSerialization process >

			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);
			System.out.println("\nDeSerialization process has started, displaying objects...");
			MyClass object = (MyClass) oin.readObject();
			System.out.println(object);
			fin.close();
			oin.close();
			System.out.println("Object DeSerialization completed.");

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}