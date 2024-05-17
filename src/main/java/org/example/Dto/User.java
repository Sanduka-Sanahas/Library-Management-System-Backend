package org.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String country;
    private String phoneNumber;

}
