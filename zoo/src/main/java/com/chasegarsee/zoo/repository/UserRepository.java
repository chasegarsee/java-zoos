package com.chasegarsee.zoo.repository;

import com.chasegarsee.zoo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
