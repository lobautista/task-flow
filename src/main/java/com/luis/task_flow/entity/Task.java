package com.luis.task_flow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {
    private UUID id;
    private String title;
    private String description;
    private String status;
    private Date date;
    @Column(name = "board_id")
    private Board boardId;
    @Column(name = "asignee_id")
    private User asigneeId;
}
