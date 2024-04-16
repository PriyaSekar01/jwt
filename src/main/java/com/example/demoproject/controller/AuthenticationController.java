package com.example.demoproject.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.response.AuthenticationRequest;
import com.example.demoproject.response.AuthenticationResponse;
import com.example.demoproject.response.AuthenticationService;
import com.example.demoproject.response.RegisterRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Api(value = "User Rest APIs", produces = "application/json", consumes = "application/json")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    @ApiOperation(value = "Register a new user", notes = "This API endpoint allows users to register.")
    @ApiResponse(code = 200, message = "User registered successfully")
    public ResponseEntity<AuthenticationResponse> register(@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    @ApiOperation(value = "Authenticate a user", notes = "This API endpoint allows users to authenticate.")
    @ApiResponse(code = 200, message = "User authenticated successfully")
    public ResponseEntity<AuthenticationResponse> authenticate(@Valid @RequestBody AuthenticationRequest request) {
      return ResponseEntity.ok(authenticationService.authenticate(request));
    
   }
    
//    @PostMapping("/login")
//    public ResponseEntity<AuthenticationResponse> authenticate(@Valid @RequestBody AuthenticationRequest request) {
//        AuthenticationResponse response = authenticationService.authenticate(request);
//        return ResponseEntity.ok(response);
//    }
}

