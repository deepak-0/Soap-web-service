package com.th.ws.demo.service;

import com.th.ws.demo.exception.EmployeeNotFoundException;
import com.th.ws.demo.model.Employee;
import com.th.ws.demo.repository.EmployeeRepository;
import https.www_torryharris_com.soap_ws_demo.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class EmployeeService {

@Autowired(required = true)
    EmployeeRepository employeeRepository;
        public Employee getEmployeeById(int employeeId) {
            Optional<Employee> empOptional = employeeRepository.findById(employeeId);
            if (empOptional.isPresent())
                return empOptional.get();
            throw new EmployeeNotFoundException("Employee with id " + employeeId + " does not exist.");

    }
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee){
            return employeeRepository.save(employee);
    }

    public Employee deleteEmployee(int empId){
            employeeRepository.deleteById(empId);
            return null;
    }
}
