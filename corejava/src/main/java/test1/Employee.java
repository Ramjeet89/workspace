package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {
    private String name;
    private String dept;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	
	public static Employee of(String name, String dept, String address) {
		Employee e = new Employee();
		e.name = name;
		e.dept = dept;
		e.address = address;
		return e;
	}
    
	/*
	 * public Employee(String name, String dept, String address) { super();
	 * this.name = name; this.dept = dept; this.address = address; }
	 */
	 
	@Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}