package ro.proiect.Imprumut.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Carte {
    @Id
    @Column(nullable = false)
    private Long id;
    private String nume;
    private String autor;
    private String editura;
    private Integer nrPagini;
    private Integer anulPublicarii;




}
