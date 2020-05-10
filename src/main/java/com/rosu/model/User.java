package com.rosu.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data //for getter and setter
@NoArgsConstructor // for no arg constructor

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Auto-increment identity-creste cu unu,auto-la fel dar dep de implementari.
    private int user_id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;

    @ManyToMany
    @JoinTable(name = "working_project",
            joinColumns = @JoinColumn(name = "user_id"), //current entity->user
            inverseJoinColumns = @JoinColumn(name = "project_id")) //foreign key->project
    private List<Project> projects;

    @OneToOne(mappedBy = "user")
    private PendingUser pendingUser;
    private boolean isAdmin;



    @Override
    public String toString() {
        return this.username;
    }
}
