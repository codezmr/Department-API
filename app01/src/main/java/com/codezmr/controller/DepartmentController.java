package com.codezmr.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codezmr.entity.Department;
import com.codezmr.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	private final Logger LOGGER = 
			LoggerFactory
			.getLogger(DepartmentController.class);
	
	
	@PostMapping("/add")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Inside saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		LOGGER.info("Inside fetchDepartmentList of DepartmentController");

		return departmentService.fetchDepartmentList();
	}

	@GetMapping("/department/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("Inside fetchDepartmentById of DepartmentController");

		return departmentService.fetchDepartmentByid(departmentId);
	}

	@GetMapping("/delete/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		
		LOGGER.info("Inside deleteDepartmentById of DepartmentController");

		return departmentService.deleteDepartmentById(departmentId);

	}

	@PutMapping("/update/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
		LOGGER.info("Inside updateDepartment of DepartmentController");

		return departmentService.updateDepartment(departmentId, department);

	}

}
