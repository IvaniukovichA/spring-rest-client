package com.spring.rest.client;

import com.spring.rest.client.configuration.MyConfig;
import com.spring.rest.client.entity.Employee;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);
//        Employee employee = new Employee("Sveta1", "Sokolova1", "HR", 700);
//        communication.saveEmployee(employee);
//        empById.setLastName("XXXXXX");
//        communication.saveEmployee(empById);
        communication.deleteEmployee(11);
    }
}
