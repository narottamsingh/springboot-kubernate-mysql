package com.bce.mysql.restcongtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bce.mysql.entity.Employee;
import com.bce.mysql.repository.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/all")
	public List<Employee> getAllEmp() {
		return employeeService.getAllEMp();
	}

	@GetMapping("/get/{empId}")
	public Employee getOneEMp(Integer empId) {
		return employeeService.getEmpByID(empId).get();
	}

	@PostMapping("/save")
	public Employee saveEmp(Employee employee) {
		return employeeService.saveEmp(employee);
	}
	
	@DeleteMapping("/del/{empId}")
	public void delEmp(Integer empId)
	{
		employeeService.delEmpById(empId);
	}

}
