package ro.proiect.Imprumut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.proiect.Imprumut.model.Imprumut;

@Repository
public interface ImprumutRepository extends JpaRepository<Imprumut, Long> {
}
