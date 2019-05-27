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

 

public class StudentSerializationTest {
	public static void main(String[] args) {

		Student object1 = new Student(1, "amy");
		Student object2 = new Student(2, "ankit");

		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, serializing employee objects...");
			oout.writeObject(object1);
			oout.writeObject(object2);
			fout.close();
			oout.close();
			System.out.println("Object Serialization completed.");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// Start deSerialization process.

		try {
			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);

			System.out.println("\nDeSerialization process has started, displaying deSerialized employee objects...");
			Student s;
			while ((s = (Student) oin.readObject()) != null) {
				System.out.println(s);
			}
			fin.close();
			oin.close();

		} catch (IOException | ClassNotFoundException e) {
			 e.printStackTrace();
		}
		System.out.println("Object DeSerialization completed.");

	}

}