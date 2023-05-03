package ro.proiect.Imprumut.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.proiect.Imprumut.model.Cititor;
import ro.proiect.Imprumut.repository.CititorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CititorService
{
    private final CititorRepository cititorRepository;
    public List<Cititor> getAllCititori()
    {
        return cititorRepository.findAll();
        //returneaza o lista de obiecte de tip cititor
    }
    public void saveCititor(Cititor cititor)
    {
        cititorRepository.saveAndFlush(cititor);
        //salveaza un singur cititor
    }

    public void deleteCititor(Long id)
    {
        cititorRepository.deleteById(id);
        //sterge un obiect de tip cititor in functie de id-ul dat
    }
}
