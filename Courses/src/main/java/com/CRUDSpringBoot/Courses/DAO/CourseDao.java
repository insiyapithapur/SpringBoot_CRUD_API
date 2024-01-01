package com.CRUDSpringBoot.Courses.DAO;

import com.CRUDSpringBoot.Courses.Model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface CourseDao extends JpaRepository<Courses,Long> {

}
