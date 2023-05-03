package ro.proiect.Imprumut.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.proiect.Imprumut.model.Carte;
import ro.proiect.Imprumut.repository.CarteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarteService {
    private final CarteRepository carteRepository;

    public List<Carte> getAllCarti()
    {
        return carteRepository.findAll();
    }
    //returneaza o lista de obiecte de tip carte
    public void saveCarte(Carte carte){
        carteRepository.saveAndFlush(carte);
    }
    //salveaza o singura carte
    public void deleteCarte(Long id)
    {
        carteRepository.deleteById(id);
    }
    //sterge un obiect de tip carte in functie de id-ul dat



}
