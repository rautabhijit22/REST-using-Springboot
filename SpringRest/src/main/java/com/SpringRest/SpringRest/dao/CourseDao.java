package com.SpringRest.SpringRest.dao;

import com.SpringRest.SpringRest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
}
