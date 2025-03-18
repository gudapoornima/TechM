package com.example.project2.dto;

public class LoginResponse {
    private Long id;
    private String role;
    private String message;

    public LoginResponse(Long id, String role, String message) {
        this.id = id;
        this.role = role;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getMessage() {
        return message;
    }
}
