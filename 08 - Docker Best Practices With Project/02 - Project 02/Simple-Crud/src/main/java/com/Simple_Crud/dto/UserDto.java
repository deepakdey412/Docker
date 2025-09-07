package com.Simple_Crud.dto;

public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String passwrod;

    // Default constructor (for serialization/deserialization)
    public UserDto() {
    }

    public UserDto(Long id, String name, String email,String passwrod) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwrod = passwrod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
}
