package miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.controller;


import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.model.Student;
import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.model.StudentList;
import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.repository.StudentRepository;
import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/eregistrar/api/student")
public class StudentController {
    @Autowired
 StudentService studentService;

    @GetMapping(value = "/list")
    public StudentList studentList() {
        List<Student> student=studentService.getListOfStudent();
        StudentList sList= new StudentList();
        sList.setStudents(student);
        return sList;
    }

    @GetMapping(value = "get/{studentId}")
    public Student getStudentById(@PathVariable("studentId") long studentId){
        return studentService.getStudentId(studentId);
    }

    @PostMapping(value="/register")
     public  void saveStudent(@Valid @RequestBody Student student){
        studentService.saveStudent(student);
    }

    @DeleteMapping(value = "delete/{studentId}")
    public void deletStudent(@PathVariable("studentId") long studentId){
        studentService.deleteStudent(studentId);
    }


    @PutMapping(value = "/update/{studentId}")
    public Student  updateStudent(@Valid @RequestBody Student editedStudent, @PathVariable Long studentId) {
        return  studentService.updateStudent(editedStudent ,studentId);
    }


}
