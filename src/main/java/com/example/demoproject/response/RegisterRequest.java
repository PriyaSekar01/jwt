package com.example.demoproject.response;

import com.example.demoproject.enumeration.UserType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String confirmPassword;
	
	private UserType userType;
}