package miu.edu.cs.cs425.lab9.eregistrar.eregistrar.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;
    @NotBlank(message = "student Number is required")
    @Column(nullable = false, unique = true)
    private String studentNumber;
    @NotBlank(message = "firstName is required")
    private String firstName;
    private String middleName;
    @NotBlank(message = "lastName is required")
    private String lastName;
    @DecimalMax("4.0")
    @DecimalMin("0.0")
    private Double cgpa;
//    @NotEmpty(message = "enrollmentDate is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollmentDate;
    @NotBlank
    private String isInternational;


    public Student() {
    }

    public Student(String studentNumber, @NotBlank(message = "firstName is required") String firstName, String middleName, @NotBlank(message = "lastName is required") String lastName, Double cgpa, LocalDate enrollmentDate, String isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }


    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getInternational() {
        return isInternational;
    }

    public void setInternational(String international) {
        isInternational = international;
    }
}
