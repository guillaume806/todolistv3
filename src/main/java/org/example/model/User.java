package org.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    private String firstname;

    @OneToMany(mappedBy = "u")
    private List<Task> tasks;




}
