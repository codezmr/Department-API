package com.codezmr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codezmr.entity.Department;
import com.codezmr.service.DepartmentService;


@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/add")
	public Department saveDepartment(@RequestBody Department department) {
		
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/department/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		
		return departmentService.fetchDepartmentByid(departmentId);
	}
}
