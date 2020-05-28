package com.tsohu.springer.Services;

import com.tsohu.springer.jpa.models.User;
import com.tsohu.springer.jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User addUser(User user){
        return repository.save(user);
    }
}
