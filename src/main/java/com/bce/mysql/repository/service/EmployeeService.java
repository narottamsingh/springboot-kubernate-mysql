package com.bce.mysql.repository.service;

import java.util.List;
import java.util.Optional;

import com.bce.mysql.entity.Employee;


public interface EmployeeService {

	List<Employee> getAllEMp();
	Optional<Employee> getEmpByID(Integer empId);
	Employee saveEmp(Employee employee);
	void delEmpById(Integer empId);
}
