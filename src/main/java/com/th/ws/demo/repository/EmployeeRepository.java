package com.th.ws.demo.repository;

import com.th.ws.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public abstract Optional<Employee> findBySalary(int salary);
}
