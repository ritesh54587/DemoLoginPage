package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.sangamone.entity.Login;




public interface LoginRepo extends CrudRepository<Login, Integer> {
	@Query(value = "select * from student where email = ?1 and password =?2", nativeQuery = true)

	public String getLoginByEmailAndPassword(String email, String password);


	





}
