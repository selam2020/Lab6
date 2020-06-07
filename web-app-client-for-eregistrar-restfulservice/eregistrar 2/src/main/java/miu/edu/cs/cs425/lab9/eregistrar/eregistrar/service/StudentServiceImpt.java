package miu.edu.cs.cs425.lab9.eregistrar.eregistrar.service;

import miu.edu.cs.cs425.lab9.eregistrar.eregistrar.model.Student;
import miu.edu.cs.cs425.lab9.eregistrar.eregistrar.model.StudentList;
import miu.edu.cs.cs425.lab9.eregistrar.eregistrar.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpt  implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    RestTemplate restTemplate;

    String baseURL = "http://localhost:8081/eregistrar/api/student";

    @Override
    public List<Student> getListOfStudent() {
        StudentList studentList = restTemplate.getForObject(baseURL + "/list", StudentList.class);
        return studentList.getStudents();
    }

    @Override
    public Student saveStudent(Student s) {
        return restTemplate.postForObject(baseURL + "/register", s, Student.class);
    }

    @Override
    public Student getStudentId(Long id) {
        return restTemplate.getForObject(baseURL + "/get/" + id, Student.class);

    }

    @Override
    public void deleteStudent(long studentId) {
        restTemplate.delete(baseURL + "/delete/" + studentId);

    }
}

