package com.luis.task_flow.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String title;
    private String description;
    private String status;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "board_id", referencedColumnName = "id")
    private Board board;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User assignee;
}
