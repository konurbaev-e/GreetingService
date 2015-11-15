package org.konurbaev.greet;

import java.util.concurrent.atomic.AtomicLong;

public interface GreetingController {

    public Greeting greeting(String name);

}
