package com.example.demo.registration;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class RegistrationRequest {
    private final String firstName, lastName, email, password;
}
