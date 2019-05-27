package serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	private void writeObject(ObjectOutputStream oos) {
		System.out.println("in writeObject() method");
		try {
			oos.writeInt(this.id);
			oos.writeObject(this.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private void readObject(ObjectInputStream ois) {
		System.out.println("In readObject() method");
		try {
			id=ois.readInt();
			name=(String)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
