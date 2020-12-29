package com.baeldung.restfulwebservice.bootstrap;

import com.baeldung.restfulwebservice.model.Foo;
import com.baeldung.restfulwebservice.service.IFooService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final IFooService service;

    @Override
    public void run(String... args) throws Exception {

        Foo foo1 = new Foo("Michael", "Jackson", new Date());
        Foo foo2 = new Foo( "George", "Clooney", new Date());

        service.save(foo1);
        service.save(foo2);

        System.out.println("Initialized the foos...");
    }
}
