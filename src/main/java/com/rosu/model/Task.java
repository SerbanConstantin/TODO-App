package com.rosu.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int id;
    private String description;
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<SubTask> subTasks;

    @ManyToOne
    private Project project;



    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "in_progress")
    private boolean inProgress;


    @Override
    public String toString() {
        return this.description;
    }
}


