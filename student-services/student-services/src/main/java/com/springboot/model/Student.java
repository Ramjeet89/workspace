package com.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {

    private String id;
    private String name;
    private String description;
    private List<Course> courses;
}
