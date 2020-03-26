package com.endava.university.repo;

import com.endava.university.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
