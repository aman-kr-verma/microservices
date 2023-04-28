package com.apigateway.model;

import lombok.*;

import java.util.Collection;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    private String userId, accesToken, refreshToken;
    private long expireAt;
    private Collection<String> authorities;

}
