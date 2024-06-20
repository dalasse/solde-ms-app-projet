package org.dgb.ds.grappfamillialeservice.model;

import lombok.*;

@Getter @Setter @ToString @NoArgsConstructor
public class Employer {
    private String matricule;
    private String prenom;
    private String nom;
    private String lieuNaissance;
    private String dateNaissance;
}
