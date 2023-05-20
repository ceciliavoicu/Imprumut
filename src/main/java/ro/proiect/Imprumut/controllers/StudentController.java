package ro.proiect.Imprumut.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.proiect.Imprumut.model.Student;
import ro.proiect.Imprumut.service.StudentService;

@RestController
@RequestMapping("api/student/imp")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<Object> getAllStudent() {
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
        //returneaza o lista cu studenti si are un cod ok(200)
    }

    @PostMapping
    public ResponseEntity<Void> salvareStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> stergeStudent(@RequestParam Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
