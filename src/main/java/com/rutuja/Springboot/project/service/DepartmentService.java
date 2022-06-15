package com.rutuja.Springboot.project.service;

import com.rutuja.Springboot.project.entity.Department;
import com.rutuja.Springboot.project.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

}
