package miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.service;

import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.model.Student;
import org.springframework.data.domain.Page;

import java.util.List;


public interface StudentService {

    public  Iterable<Student> getListOfStudent();
    public Student saveStudent(Student student);
    public Student getStudentId(Long studentId);
    public  void deleteStudent(long studentId);
    public Student updateStudent(Student updatedStudent,Long studentId);
   //public abstract Page<Student> getAllStudentsPaged(int pageNo);
      List<Student> searchStudents(String searchString);
}
