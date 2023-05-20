package ro.proiect.Imprumut.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.proiect.Imprumut.model.Imprumut;
import ro.proiect.Imprumut.repository.ImprumutRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImprumutService {
    private final ImprumutRepository imprumutRepository;

    public List<Imprumut> getAllImprumut() {
        return imprumutRepository.findAll();
        //returneaza o lista de obiecte de tip imprumut,find face un select in spate
    }

    public void saveImprumut(Imprumut imprumut) {
        imprumutRepository.saveAndFlush(imprumut);
        //salveaza un singur imprumut
    }

    public void deleteImprumut(Long id) {
        imprumutRepository.deleteById(id);
        //sterge un obiect de tip imprumut in functie de id-ul dat
    }
}
