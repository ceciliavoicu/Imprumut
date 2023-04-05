package ro.proiect.Imprumut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.proiect.Imprumut.model.Cititor;

@Repository
public interface CititorRepository extends JpaRepository<Cititor,Long> {
}
