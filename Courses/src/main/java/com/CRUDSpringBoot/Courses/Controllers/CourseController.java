package com.CRUDSpringBoot.Courses.Controllers;
import com.CRUDSpringBoot.Courses.Model.Courses;
import com.CRUDSpringBoot.Courses.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService CS;

    @Autowired
    public CourseController(CourseService courseService) {
        this.CS = courseService;
    }

    //Get ALl The Courses
    @GetMapping("/api/courses")
    public List<Courses> getCourses()
    {
        return CS.getCourses();
    }

    //Get Specific Course (Search)
    @GetMapping("api/Course/{courseId}")
    public Courses getCourse(@PathVariable String courseId)
    {
        return CS.getCourse(Long.parseLong(courseId));
    }

    //Adding the new Course
    @PostMapping(path = "api/Course" , consumes = "application/json")
    public Courses addCourse(@RequestBody Courses crs){
        return CS.addCourse(crs);
    }

    @PutMapping(path = "api/Course" , consumes = "application/json")
    public Courses UpdateCourse(@RequestBody Courses crs){
        return CS.updateCourse(crs);
    }

    @DeleteMapping("api/Course/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try
        {
            CS.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
