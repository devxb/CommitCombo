package com.commitcombo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.commitcombo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUserName(String userName);
	
	@Query("select u from User as u order by u.contributionCount")
	List<User> findAllWithSort();
	
}