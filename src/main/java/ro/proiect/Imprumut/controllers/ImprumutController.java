package ro.proiect.Imprumut.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ro.proiect.Imprumut.model.Cititor;
import ro.proiect.Imprumut.model.Imprumut;
import ro.proiect.Imprumut.repository.ImprumutRepository;
import ro.proiect.Imprumut.service.ImprumutService;

@RestController
@RequestMapping("imprumut/imp")
@RequiredArgsConstructor

public class ImprumutController
{
    private final ImprumutService imprumutService;
    @GetMapping
    public ResponseEntity<Object> getAllImprumut()
    {
        return new ResponseEntity<>(imprumutService.getAllImprumut(), HttpStatus.OK);
        //returneaza o lista cu imprumuturi si are un cod ok(200)
    }
    @PostMapping
    public ResponseEntity<Void> saveImprumut(@RequestBody Imprumut imprumut)
    {
        imprumutService.saveImprumut(imprumut);
        //intercepteaza un body pe care il trimite in browser,si apeleaza metoda care face salvare
        return  new ResponseEntity<>(HttpStatus.CREATED);
        //returneaza un sttaus, dar nu face nimic

    }
    @DeleteMapping
    public ResponseEntity<Void> deleteImprumut(@RequestParam Long id)
    {
        imprumutService.deleteImprumut(id);
        //intercepteaza un parametru pe care il trimite in browser,si apeleaza metoda care face salvare
        return new ResponseEntity<>(HttpStatus.OK);
        //returneaza un sttaus, dar nu face nimic
    }
}
