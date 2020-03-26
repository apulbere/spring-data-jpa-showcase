package com.endava.university.repo;

import com.endava.university.domain.Course;
import com.endava.university.view.CourseView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface CourseQueryRepository extends ReadOnlyRepository<Course, Integer> {
    Optional<Course> findByName(@Param("name") String name);

    List<Course> findByDepartmentChairMemberLastName(@Param("name") String chair);

    @Query("Select c from Course c where c.department.chair.member.lastName=:chair")
    List<Course> findByChairLastName(@Param("chair") String chairLastName);

    @Query("Select new com.endava.university.view.CourseView" +
            "(c.name, c.instructor.member.lastName, c.department.name) from Course c where c.id=?1")
    CourseView getCourseView(int courseId) ;

    Page<Course> findByCredits(@Param("credits") int credits, Pageable pageable);

    List<Course> getByDepartmentName(@Param("name") String name);

    @Query("Select new com.endava.university.view.CourseView" +
            "(c.name, c.instructor.member.lastName, c.department.name) from Course c where c.name=?1")
    Optional<CourseView> getCourseViewByName(@Param("name") String name);
}