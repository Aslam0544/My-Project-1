package com.aslam.www.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aslam.www.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> 
{
}
