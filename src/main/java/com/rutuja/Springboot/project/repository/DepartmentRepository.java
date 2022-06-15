package com.rutuja.Springboot.project.repository;


import com.rutuja.Springboot.project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByName (String departmentName);

   Department findByNameIgnoreCase (String departmentName);
}
