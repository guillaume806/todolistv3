package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name= "customers")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Task> tasks;

    public User() {
    }

    public User(Long id, String firstname, List<Task> tasks) {
        this.id = id;
        this.firstname = firstname;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
