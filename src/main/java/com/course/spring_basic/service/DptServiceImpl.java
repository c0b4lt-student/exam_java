package com.course.spring_basic.service;

import com.course.spring_basic.model.Department;
import com.course.spring_basic.repository.DptRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DptServiceImpl implements DptService{

    private final DptRepository dptRepository;
    @Override
    public Department create(Department dpt) {
        return dptRepository.save(dpt);
    }

    @Override
    public List<Department> read() {
        return dptRepository.findAll();
    }

    //@Override
    //public Department readByCode(String code) {
    //    return dptRepository.findByCode(code);
    //}

    @Override
    public Department update(Long id, Department dpt) {
        return dptRepository.findById(id)
                .map( d -> {
                    d.setCode(dpt.getCode());
                    d.setName(dpt.getName());
                    return dptRepository.save(d);
                }).orElseThrow(() -> new RuntimeException("Departement non trouvé"));
    }

    @Override
    public String delete(Long id) {
        dptRepository.deleteById(id);
        return "Departement supprimé";
    }
}
