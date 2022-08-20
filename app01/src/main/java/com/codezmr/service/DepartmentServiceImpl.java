package com.codezmr.service;

import java.util.List;
import java.util.Objects;

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

	@Override
	public String deleteDepartmentById(Long departmentId) {
		
		try {
			departmentRepo.deleteById(departmentId);
			return "Deleted Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "Deletion Failure";
		}
		
		
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		
		Department depDb = departmentRepo.getById(departmentId);
		
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDb.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDb.setDepartmentCode(department.getDepartmentCode());
		}
		
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDb.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		return departmentRepo.save(depDb);
	}

}
