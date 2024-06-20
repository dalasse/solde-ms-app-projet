package org.dgb.ds.grappfamillialeservice.entities;


import jakarta.persistence.*;
import lombok.*;
import org.dgb.ds.grappfamillialeservice.model.Employer;

@Entity
@Table(name = "FAMILLE_EMPLOYER")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class FamilleEmployer {

    @Id
    @Column(length = 20)
    private String code;
    @Column(length = 50)
    private String prenom;
    private String nom;
    @Column(length = 50, name= "lieu_naissance")
    private String lieuNaissance;
    @Temporal(TemporalType.DATE)
    @Column(length = 50, name= "date_naissance")
    private String dateNaissance;

    @Column(length = 20)
    private String matricule;
    @Transient
    private Employer employer;

}
