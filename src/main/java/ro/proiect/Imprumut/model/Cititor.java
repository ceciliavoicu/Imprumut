package ro.proiect.Imprumut.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cititor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String nume;
    private String prenume;
    private String adresa;
    private String nrTelefon;
    private String email;

}
