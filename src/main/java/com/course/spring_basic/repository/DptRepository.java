package com.course.spring_basic.repository;

import com.course.spring_basic.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DptRepository extends JpaRepository<Department, Long> {

}
