package com.baeldung.restfulwebservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class Foo {
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
}
