package com.endava.university.repo;

import com.endava.university.domain.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
