package com.SpringRest.SpringRest.service;

import com.SpringRest.SpringRest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getSingleCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);
    public void deleteCourse(long courseId);
}
