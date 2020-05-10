package com.rosu.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity
@Table(name="subtask")
public class SubTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subtask_id")
    private int id;
    private String description;

    @ManyToOne
    private Task task;



    @Override
    public String toString() {
        return "SubTask{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", task=" + task +
                '}';
    }
}

