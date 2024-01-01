package com.CRUDSpringBoot.Courses.Services;

import com.CRUDSpringBoot.Courses.DAO.CourseDao;
import com.CRUDSpringBoot.Courses.Model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;

@Service
public class CourseService {
    @Autowired
    private CourseDao CD;
//    List<Courses> lst;
//    public CourseService(){
//        lst = new ArrayList<>();
//        lst.add(new Courses(145L,"hello","jdvsaj"));
//        lst.add(new Courses(4345L,"hello2","aifein"));
//    }
    public List<Courses> getCourses()
    {
//        return lst;
        return CD.findAll();
    }

    public Courses getCourse(Long courseId){
//        Courses c  = null;
//        for(Courses Crs : lst)
//        {
//            if(Objects.equals(Crs.getId(), courseId))
//            {
//                c = Crs;
//                break;
//            }
//        }
        return CD.getOne(courseId);
    }

    public Courses addCourse(Courses crs) {
//        lst.add(crs);
//        return crs;
          CD.save(crs);
          return  crs;
    }

    public Courses updateCourse(Courses crs) {
//        lst.forEach(e->{
//            if(Objects.equals(e.getId(), crs.getId()))
//            {
//                e.setCoursetitle(crs.getCoursetitle());
//                e.setCoursedescription(crs.getCoursedescription());
//            }
//        });
        CD.save(crs);
        return crs;
    }

    public void deleteCourse(long courseId) {
//        lst = lst.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
        Courses entity = CD.getOne(courseId);
        CD.delete(entity);
    }
}
