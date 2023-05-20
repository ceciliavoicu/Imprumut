package ro.proiect.Imprumut.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.proiect.Imprumut.model.Cititor;
import ro.proiect.Imprumut.service.CititorService;

@RestController
@RequestMapping("api/cititor/imp")
@RequiredArgsConstructor
public class CititorController {
    private final CititorService cititorService;

    @GetMapping
    public ResponseEntity<Object> getAllCititori() {
        return new ResponseEntity<>(cititorService.getAllCititori(), HttpStatus.OK);
        //returneaza o lista cu cititori si are un cod ok(200)
    }

    @PostMapping
    public ResponseEntity<Void> saveCititor(@RequestBody Cititor cititor) {
        cititorService.saveCititor(cititor);
        //intercepteaza un body pe care il trimite in browser,si apeleaza metoda care face salvare
        return new ResponseEntity<>(HttpStatus.CREATED);
        //returneaza un sttaus, dar nu face nimic

    }

    @DeleteMapping
    public ResponseEntity<Void> deleteCititor(@RequestParam Long id) {
        cititorService.deleteCititor(id);
        //intercepteaza un parametru pe care il trimite in browser,si apeleaza metoda care face salvare
        return new ResponseEntity<>(HttpStatus.OK);
        //returneaza un sttaus, dar nu face nimic
    }
}
