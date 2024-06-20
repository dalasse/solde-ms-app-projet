package org.dgb.ds.grappfamillialeservice.web;
import org.dgb.ds.grappfamillialeservice.clients.EmployerRestClient;
import org.dgb.ds.grappfamillialeservice.entities.FamilleEmployer;
import org.dgb.ds.grappfamillialeservice.model.Employer;
import org.dgb.ds.grappfamillialeservice.repository.FamilleEmployerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FamilleEmployerRestController {
    private FamilleEmployerRepository familleEmployerRepository;
    private EmployerRestClient employerRestClient;

    public FamilleEmployerRestController(FamilleEmployerRepository familleEmployerRepository, EmployerRestClient employerRestClient) {
        this.familleEmployerRepository = familleEmployerRepository;
        this.employerRestClient = employerRestClient;
    }

    @GetMapping("/familleEmployers")
    public List<FamilleEmployer> employerList() {
        return familleEmployerRepository.findAll();
    }

    @GetMapping("/familleEmployers/{id}")
    public FamilleEmployer employersById(@PathVariable String id) {
        FamilleEmployer familleEmployer = familleEmployerRepository.findById(id).get();
        Employer employer = employerRestClient.findEmployerById(familleEmployer.getMatricule());
        familleEmployer.setEmployer(employer);
        return familleEmployer;
    }
}
