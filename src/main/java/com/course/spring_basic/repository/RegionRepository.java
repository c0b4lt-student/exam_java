package com.course.spring_basic.repository;

import com.course.spring_basic.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {

}
