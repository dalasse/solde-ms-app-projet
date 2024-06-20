package org.dgb.ds.employerservice.repository;

import org.dgb.ds.employerservice.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer,String> {

}
