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


    public Category() {
    }

    public Category(Long id, String cname, List<Task> tasks) {
        this.id = id;
        Cname = cname;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
