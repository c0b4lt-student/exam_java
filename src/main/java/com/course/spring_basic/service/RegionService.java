package com.course.spring_basic.service;

import com.course.spring_basic.model.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {
    Region create(Region region);

    List<Region> read();

    Optional<Region> readById(Long id);

    Region update(Long id, Region region);

    String delete(Long id);
}
