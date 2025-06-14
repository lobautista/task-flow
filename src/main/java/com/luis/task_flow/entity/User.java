package com.luis.task_flow.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String name;
    private String email;
    private String password;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
    private List<Task> tasks;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Board> ownedBoards;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BoardMember> memberships;
}
