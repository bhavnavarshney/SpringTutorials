package com.learning.accessingdatamysql.repository;

import org.springframework.data.repository.CrudRepository;
import com.learning.accessingdatamysql.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
} 