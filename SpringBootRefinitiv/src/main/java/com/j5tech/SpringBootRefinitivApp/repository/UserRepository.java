package com.j5tech.SpringBootRefinitivApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.j5tech.SpringBootRefinitivApp.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}