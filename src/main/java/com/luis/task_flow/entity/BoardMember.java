package com.luis.task_flow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "boards_members")
@Getter
@Setter
public class BoardMember {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private Board boardId;
    private User userId;
    private String role;
    private Timestamp timestamp;
}
