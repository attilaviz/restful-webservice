package com.baeldung.restfulwebservice.controller;

import com.baeldung.restfulwebservice.model.Foo;
import com.baeldung.restfulwebservice.service.IFooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foos")
public class FooController {

    @Autowired
    private IFooService service;

    @GetMapping
    public List<Foo> findAll() {
        return service.findAll();
    }
}
