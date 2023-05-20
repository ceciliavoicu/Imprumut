package ro.proiect.Imprumut.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String nume;
    private String autor;
    private String editura;
    private Integer nrPagini;
    private Integer anulPublicarii;
}
