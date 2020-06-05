package miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.repository;

import miu.educs.cs425.lab10.eregistrar.eregistrarwebapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

   List<Student> findAllByEnrollmentDateEquals(LocalDate enrollDate);
    List<Student> findAllByFirstNameContainingOrLastNameContainingOrIsInternationalContainingOrderByFirstName(String firstName,
                                                                                                                        String lastName,
                                                                                                                        String isInternational);

}
