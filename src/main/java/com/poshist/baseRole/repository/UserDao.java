package com.poshist.baseRole.repository;


import com.poshist.baseRole.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao  extends CrudRepository<User, Long> {
    User findOneBySysname(String sysname);
}
