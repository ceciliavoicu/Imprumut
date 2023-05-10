package ro.proiect.Imprumut.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long Id;
    private String nume;
    private String gen;
    private Integer varsta;
    private Integer medie;
}
