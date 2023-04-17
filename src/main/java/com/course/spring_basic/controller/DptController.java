package com.course.spring_basic.controller;

import com.course.spring_basic.model.Department;
import com.course.spring_basic.service.DptService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/department")
@AllArgsConstructor
public class DptController {
    private final DptService dptService;

    @GetMapping("/")
    public List<Department> read() {
        return dptService.read();
    }

    //@GetMapping("/{code}")
    //public Department readByCode(@PathVariable String code) {
    //    return dptService.readByCode(code);
    //}
}
