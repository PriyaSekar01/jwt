package com.example.demoproject.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoproject.entity.User;
import com.example.demoproject.response.RegisterRequest;
@Repository
public interface UserRepository extends JpaRepository<User, UUID>{

	
	Optional<User> findByEmail(String email);

}
