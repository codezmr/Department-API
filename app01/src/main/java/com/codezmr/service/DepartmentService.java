package com.codezmr.service;

import java.util.List;

import com.codezmr.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentByid(Long departmentId);

	public String deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

}
