package com.tsohu.springer.jpa.repositories;

import com.tsohu.springer.jpa.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
