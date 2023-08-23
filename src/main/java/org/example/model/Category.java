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
    @ManyToMany
    @JoinTable(name = "category", joinColumns = @JoinColumn(name = "tasks_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Task> tasks = new ArrayList<>();




}
