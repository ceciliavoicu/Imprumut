package ro.proiect.Imprumut.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
public class Imprumut {
    @Id
    @Column(nullable = false)
    private Long id;
    private Carte carte;
    private Cititor cititor;
    private LocalDateTime dataImprumut;
    private LocalDateTime dataReturnarii;
    private String status;



}
