package ro.proiect.Imprumut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.proiect.Imprumut.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
}
