package org.dgb.ds.grappfamillialeservice.clients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.dgb.ds.grappfamillialeservice.model.Employer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "EMPLOYER-SERVICE")
public interface EmployerRestClient {

    @GetMapping("/employers/{id}")
    @CircuitBreaker(name = "employerService" , fallbackMethod = "getDefaultEmployer")
    Employer findEmployerById(@PathVariable String id);
    @GetMapping("/employers")
    @CircuitBreaker(name = "employerService" , fallbackMethod = "getAllEmployer")
    List<Employer> allEmployer();

    default  Employer getDefaultEmployer(String id , Exception exception){
        Employer employer = new Employer();

        employer.setMatricule(id);
        employer.setPrenom("Not vailabe");
        employer.setNom("Not vailabe");

        return employer;
    }

    default  List<Employer> getAllEmployer( Exception exception){
        return List.of();
    }
}
