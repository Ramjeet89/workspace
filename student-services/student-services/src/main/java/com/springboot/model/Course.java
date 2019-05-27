package com.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
public class Course {

    private String id;
    private String name;
    private String description;
    private List<String> steps;

}
