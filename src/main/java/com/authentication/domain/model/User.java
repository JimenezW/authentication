package com.authentication.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel {

    private String userName;

    private String lastName;

    private String password;

    private String email;
}
