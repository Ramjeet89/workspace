package test1;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExampleMain {
    public static void main(String[] args) throws IOException {
        Employee employee =  Employee.of("Trish", null, null);
        ObjectMapper om = new ObjectMapper();
        String jsonString = om.writeValueAsString(employee);
        System.out.println(jsonString);
    }
}