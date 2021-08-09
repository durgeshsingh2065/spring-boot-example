package com.durgesh.api;

import com.durgesh.api.Employee;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class EmployeeController{

    @RequestMapping(value = "/api/allEmployee", method = RequestMethod.GET)
    public @ResponseBody  ArrayList<Employee> getAllEmployee(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(1, "Durgesh Singh", "Working on AWS Cloud");
		Employee emp2 = new Employee(1, "Ajay", "Working on Azure Cloud");
		list.add(emp1);
		list.add(emp2);
        return list;
    }
}
