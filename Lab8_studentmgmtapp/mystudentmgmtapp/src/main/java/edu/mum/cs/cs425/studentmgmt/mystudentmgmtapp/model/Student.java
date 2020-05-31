package edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model;


import org.hibernate.engine.internal.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;
    @NotBlank
    private String  studentNumber ;
    @NotBlank
    private  String firstName ;
    private  String middleName;
    @NotBlank
    private String lastName;
    private Double cgpa;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfEnrollement;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="transcrpitId")
    private Transcript transcript;
    @ManyToOne
    @JoinColumn(name="classroomId")
    private ClassRoom classRoom;

    public Student() {
    }

    public Student(Long studentid, String studentNumber, String firstName,String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollement) {
        this.studentid = studentid;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollement = dateOfEnrollement;

    }
    public Student(@NotBlank String studentNumber, @NotBlank String firstName, String middleName, @NotBlank String lastName, Double cgpa, LocalDate dateOfEnrollement, Transcript transcript) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollement = dateOfEnrollement;
        this.transcript=transcript;
//        this.classRoom=classRoom;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {this.middleName = middleName; }

    public String getMiddleName() { return middleName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public void setDateOfEnrollement(LocalDate dateOfEnrollement) {
        this.dateOfEnrollement = dateOfEnrollement;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public LocalDate getDateOfEnrollement() {
        return dateOfEnrollement;
    }

    public Transcript getTranscript() {return transcript; }

    public void setTranscript(Transcript transcript) { this.transcript = transcript; }

    public ClassRoom getClassRoom() { return classRoom; }

    public void setClassRoom(ClassRoom classRoom) {this.classRoom = classRoom; }



    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollement=" + dateOfEnrollement +
                '}';
    }
}