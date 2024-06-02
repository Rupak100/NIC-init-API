package com.bezkoder.spring.jwt.mongodb.payload.response;

public class JwtResponse {
	private String token;
	private String id;
	private String username;
	private String email;

	public JwtResponse(String token, String id, String username, String email) {
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
	}

	// Getters and Setters
}
