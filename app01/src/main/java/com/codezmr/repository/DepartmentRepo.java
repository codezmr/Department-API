package com.codezmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codezmr.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
