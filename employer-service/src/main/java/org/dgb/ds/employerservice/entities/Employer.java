package org.dgb.ds.employerservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EMPLOYER")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class Employer {

    @Id
    @Column(length = 20)
    private String matricule;
    @Column(length = 50)
    private String prenom;
    @Column(length = 30)
    private String nom;
    @Column(length = 50, name= "lieu_naissance")
    private String lieuNaissance;
    @Temporal(TemporalType.DATE)
    @Column(length = 50, name= "date_naissance")
    private String dateNaissance;
}
