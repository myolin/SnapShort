package com.myolin.urlshortener.dto;

import lombok.Data;

import java.util.Set;

@Data
public class SignupRequestDTO {

    private String username;
    private String email;
    private Set<String> role;
    private String password;

}
