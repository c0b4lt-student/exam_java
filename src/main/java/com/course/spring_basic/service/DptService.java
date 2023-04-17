package com.course.spring_basic.service;

import com.course.spring_basic.model.Department;

import java.util.List;

public interface DptService {
    Department create(Department dpt);

    List<Department> read();

    //Department readByCode(String code);

    Department update(Long id, Department dpt);

    String delete(Long id);
}
