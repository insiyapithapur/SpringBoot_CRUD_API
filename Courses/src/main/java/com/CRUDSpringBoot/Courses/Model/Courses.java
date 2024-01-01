package com.CRUDSpringBoot.Courses.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Courses {
    @Id
    private Long id;
    private String coursetitle;
    private String coursedescription;

    public Courses(int i, String hello) {
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", course title='" + coursetitle + '\'' +
                ", course description='" + coursedescription + '\'' +
                '}';
    }
}
