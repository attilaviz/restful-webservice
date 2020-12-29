package com.baeldung.restfulwebservice.service;

import com.baeldung.restfulwebservice.model.Foo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FooServiceImpl implements IFooService {

    private List<Foo> list = new ArrayList<>();

    @Override
    public List<Foo> findAll() {
        return list;
    }

    @Override
    public Foo save(Foo foo) {
        list.add(foo);
        return foo;
    }
}
