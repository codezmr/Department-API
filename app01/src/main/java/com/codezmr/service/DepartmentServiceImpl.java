package com.codezmr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codezmr.entity.Department;
import com.codezmr.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepo.findAll();
	}


	@Override
	public Department fetchDepartmentByid(Long departmentId) {
		return departmentRepo.findById(departmentId).get();
	}

}
