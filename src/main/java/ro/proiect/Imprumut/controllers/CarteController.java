package ro.proiect.Imprumut.controllers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.proiect.Imprumut.model.Carte;
import ro.proiect.Imprumut.service.CarteService;

import java.util.List;

@RestController
@RequestMapping("api/carte/imp")
@RequiredArgsConstructor

public class CarteController {
    private final CarteService carteService;
    @GetMapping
    public ResponseEntity<Object> getAllCarti()
    {
        return new ResponseEntity<>( carteService.getAllCarti(), HttpStatus.OK);
        //returneaza o lista cu carti si are un cod ok(200)
    }
    @PostMapping
    public ResponseEntity<Void> salvareCarte(@RequestBody Carte carte)
    {
        carteService.saveCarte(carte);
        //intercepteaza un body pe care il trimite in browser,apeleaza metoda care face salvare
        return new ResponseEntity<>(HttpStatus.CREATED);
        //returneaza un status, dar nu face nimic
    }

    @DeleteMapping
    public ResponseEntity<Void> stergeCarte(@RequestParam Long id)
    {
        carteService.deleteCarte(id);
        //intercepteaza un parametru pe care il trimite in browser ,apeleaza metoda care face stergerea
        return new ResponseEntity<>(HttpStatus.OK);
        //returneaza un status, dar nu face nimic
    }

}
