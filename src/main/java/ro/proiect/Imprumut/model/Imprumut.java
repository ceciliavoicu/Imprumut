package ro.proiect.Imprumut.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Imprumut {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @ManyToOne
    private Carte carte;
    @ManyToOne
    private Cititor cititor;
    private LocalDateTime dataImprumut;
    private LocalDateTime dataReturnarii;
    private String status;

}
