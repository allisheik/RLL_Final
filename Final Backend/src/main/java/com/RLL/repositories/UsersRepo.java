package com.RLL.repositories;

import org.springframework.data.repository.CrudRepository;
import com.RLL.models.Users;

public interface UsersRepo extends CrudRepository<Users, Integer>{

}