package com.endava.university.repo;


import com.endava.university.domain.Person;
import com.endava.university.domain.Student;
import org.springframework.data.repository.NoRepositoryBean;

import java.time.LocalDate;
import java.util.List;

/**
 * Declaring a StudentQueryRepository which can only query the Database
 */
@NoRepositoryBean
public interface StudentQueryRepository extends ReadOnlyRepository<Student, Integer>{
    //Simple Query Methods
    List<Student> findByFullTime(boolean fullTime);
    List<Student> findByBirthDate(LocalDate birthDate);
    List<Student> findByAttendeeLastName(String last);

    //Query Methods with Clauses and Expressions
    Student findByAttendeeFirstNameAndAttendeeLastName(String firstName, String lastName);
    Student findByAttendee(Person person);
    List<Student> findByBirthDateGreaterThan(LocalDate birthDate);
    List<Student> findByBirthDateLessThan(LocalDate birthDate);
    List<Student> findByAttendeeLastNameIgnoreCase(String lastName);
    List<Student> findByAttendeeLastNameLike(String likeString);
    Student findFirstByOrderByAttendeeLastNameAsc();
    Student findTopByOrderByBirthDateDesc();
    List<Student> findTop3ByOrderByBirthDateDesc();
}
