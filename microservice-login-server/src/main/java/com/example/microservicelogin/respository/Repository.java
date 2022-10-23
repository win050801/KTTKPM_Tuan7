package com.example.microservicelogin.respository;

import com.example.microservicelogin.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<User,Long> {
    User findByUsername(String username);

}
