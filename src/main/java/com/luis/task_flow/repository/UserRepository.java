package com.luis.task_flow.repository;

import com.luis.task_flow.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
