package com.SpringRest.SpringRest.service;

import com.SpringRest.SpringRest.dao.CourseDao;
import com.SpringRest.SpringRest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;
    List<Course> list;

    public CourseServImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(145, "Java core course", "this course is java"));
//        list.add(new Course(4343, "Spring course", "SPringBoot course"));
    }

    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
    }

    @Override
    public Course getSingleCourse(long courseId) {
//        Course c = null;
//        for(Course course:list){
//            if(course.getId()==courseId){
//                c = course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        for(Course c : list){
//            if(c.getId()==course.getId()){
//                c.setTitle(course.getTitle());
//                c.setDescription(course.getDescription());
//            }
//        }
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
//        list = this.list.stream().filter(e -> e.getId()!=courseId).collect(Collectors.toList());
        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
    }
}
