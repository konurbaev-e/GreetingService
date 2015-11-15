package org.konurbaev.greet.impl;

import org.konurbaev.greet.Greeting;
import org.konurbaev.greet.GreetingController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;

@RestController
public class GoodbyeController implements GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/goodbye")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        BiFunction<Long, String, Greeting> greetingFactory = GoodbyeGreeting::new;
        return greetingFactory.apply(counter.incrementAndGet(), name);
    }
}