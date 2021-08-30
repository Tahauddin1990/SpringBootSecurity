package com.tahauddin.syed.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tahauddin.syed.entity.UsersInfo;

public interface UserRepository extends JpaRepository<UsersInfo, Integer> {
	
	Optional<UsersInfo> findByUserName(String userName);
	

}
