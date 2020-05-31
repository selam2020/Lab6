package edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp;

import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.Student;
import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.repository.ClassRoomReapository;
import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ClassRoomReapository classRoomReapository;
   @Override
    public void run(String... args) throws Exception {
       Transcript t1= new Transcript("BS Computer Science");
       Transcript t2= new Transcript("BS Software Development");

       ClassRoom r1= new ClassRoom("McLaughlin building","M105");


       Student s1= new Student("000-61-0001","Anna","Lynn","Smith",3.45, LocalDate.of(2019,5,24),t1);
       Student s2= new Student("000-61-0002","Hana","Dave","Jhon",3.55, LocalDate.of(2020,5,24),t2);
       Student s3= new Student("000-61-0003","Liz","Richard","Rick",3.69, LocalDate.of(2019,8,1),t2);
       Student s4= new Student("000-61-0003","Dan","Chris","Jim",3.68, LocalDate.of(2019,8,1),t2);
       Student s5= new Student("000-61-0003","Eden","Esiet","Ghide",3.67, LocalDate.of(2019,8,1),t1);
       Student s6= new Student("000-61-0003","Selam","Esiet","Ghide",3.66, LocalDate.of(2019,8,1),t2);

       List<Student> students1= Arrays.asList(s1,s2,s3,s4,s5,s6);
       r1.setStudent(students1);
       r1.addStudent(students1);
       saveClassRoom(r1);
   }

    public static void main(String[] args) {
        SpringApplication.run(StudentMgmtApp.class, args);
    }

//    public Student saveStudent(Student student){
//        return studentRepository.save(student);
//    }
    public ClassRoom saveClassRoom(ClassRoom classRoom) {
        return classRoomReapository.save(classRoom);

    }
}
