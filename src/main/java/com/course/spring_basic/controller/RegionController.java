package com.course.spring_basic.controller;

import com.course.spring_basic.model.Region;
import com.course.spring_basic.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/region")
@AllArgsConstructor
public class RegionController {
    private final RegionService regionService;

    @PostMapping("/create")
    public Region create(@RequestBody Region region) {
        return regionService.create(region);
    }

    @GetMapping("/")
    public List<Region> read() {
        return regionService.read();
    }

    @GetMapping("/{id}")
    public Optional<Region> readById(@PathVariable Long id) {
        return regionService.readById(id);
    }

    @PutMapping("/update/{id}")
    public Region update(@PathVariable Long id, @RequestBody Region region) {
        return regionService.update(id, region);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return regionService.delete(id);
    }
}
