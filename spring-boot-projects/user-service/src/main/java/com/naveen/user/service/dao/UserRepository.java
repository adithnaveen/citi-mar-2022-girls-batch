package com.naveen.user.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naveen.user.service.bean.User;


// this interface will internally create CRUD opernateions
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
