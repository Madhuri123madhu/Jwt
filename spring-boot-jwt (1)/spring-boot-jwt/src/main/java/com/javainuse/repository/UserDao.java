package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer>{
	UserDao findByUsername(String username);
}
