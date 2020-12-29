package com.baeldung.restfulwebservice.service;

import com.baeldung.restfulwebservice.model.Foo;

import java.util.List;

public interface IFooService {
    List<Foo> findAll();

    Foo save(Foo foo);
}
