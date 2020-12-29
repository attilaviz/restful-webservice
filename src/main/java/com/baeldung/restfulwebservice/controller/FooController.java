package com.baeldung.restfulwebservice.controller;

import com.baeldung.restfulwebservice.model.Foo;
import com.baeldung.restfulwebservice.service.IFooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@RequestMapping("/foos")
public class FooController {

    @Autowired
    private IFooService service;

    @GetMapping(produces = "application/json")
    public List<Foo> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Foo findById(@PathVariable("id") Long id) {
        throw new BadRequestException();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Foo create(@RequestBody Foo foo) {
        return service.save(foo);
    }
}
