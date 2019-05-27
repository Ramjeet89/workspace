package test;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class EmployeeMain {
    public static void main(String[] args) throws IOException {
        Employee employee = Employee.of("Trish", null, null);
        ObjectMapper om = new ObjectMapper();
        String jsonString = om.writeValueAsString(employee);
        System.out.println(jsonString);
    }
}