package miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.service;
import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.model.Student;
import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpt  implements StudentService {
      @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getListOfStudent() {
        return studentRepository.findAll();
    }
    @Override
    public Student getStudentId(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Student editedStudent, Long studentId) {
        return studentRepository.findById(studentId)
                .map(student->{student.setFirstName(editedStudent.getFirstName());
                student.setStudentNumber(editedStudent.getStudentNumber());
               student.setMiddleName(editedStudent.getMiddleName());
               student.setLastName(editedStudent.getLastName());
               student.setEnrollmentDate(editedStudent.getEnrollmentDate());
               student.setCgpa(editedStudent.getCgpa());
               student.setIsInternational(editedStudent.getIsInternational());
               return  studentRepository.save(student);}).orElseGet(()->{
                    return studentRepository.save(editedStudent);

                });
    }



}
