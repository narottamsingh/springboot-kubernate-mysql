package com.bce.mysql.repository.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bce.mysql.entity.Employee;
import com.bce.mysql.repository.EmployeeRepository;
import com.bce.mysql.repository.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEMp() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmpByID(Integer empId) {
		return employeeRepository.findById(empId);
	}

	@Override
	public Employee saveEmp(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void delEmpById(Integer empId) {
		employeeRepository.deleteById(empId);
	}

}
