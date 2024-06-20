package org.dgb.ds.employerservice.web;

import org.dgb.ds.employerservice.entities.Employer;
import org.dgb.ds.employerservice.repository.EmployerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployerRestController {
    private EmployerRepository employerRepository;

    public EmployerRestController(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @GetMapping("/employers")
    public List<Employer>  employerList () {
        return employerRepository.findAll();
    }
    @GetMapping("/employers/{id}")
    public Employer employersById (@PathVariable String id){
        return employerRepository.findById(id).get();
    }
}
