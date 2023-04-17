package com.course.spring_basic.service;

import com.course.spring_basic.model.Region;
import com.course.spring_basic.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService{

    private final RegionRepository regionRepository; //Le constructeur va initialiser la variable
    @Override
    public Region create(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public List<Region> read() {
        return regionRepository.findAll();
    }

    @Override
    public Optional<Region> readById(Long id) {
        return regionRepository.findById(id);
    }

    @Override
    public Region update(Long id, Region region) {
        return regionRepository.findById(id)
                .map(r -> {
                    r.setCode(region.getCode());
                    r.setName(region.getName());
                    return regionRepository.save(r);
                }).orElseThrow(() -> new RuntimeException("Produit non trouvé !"));
    }

    @Override
    public String delete(Long id) {
        regionRepository.deleteById(id);
        return "region supprimée";
    }
}
