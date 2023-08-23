package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String Cname;

    @ManyToMany(mappedBy = "tasks")
    private List<Task> tasks = new ArrayList<>();




}
