package ro.proiect.Imprumut.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.proiect.Imprumut.model.Student;
import ro.proiect.Imprumut.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    //returneaza o lista de obiecte de tip student
    public void saveStudent(Student student) {
        studentRepository.saveAndFlush(student);
    }

    //salveaza un singur student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    //sterge un obiect de tip student in functie de id-ul dat

}
