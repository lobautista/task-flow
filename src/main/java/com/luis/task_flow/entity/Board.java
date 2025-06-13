package com.luis.task_flow.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "entities")
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String name;
    private User owner_id;
    @Column(name = "created_at")
    private Timestamp createdAt;
    private List<Task> tasks;
}
