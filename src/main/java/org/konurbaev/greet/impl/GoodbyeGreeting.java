package org.konurbaev.greet.impl;

import org.konurbaev.greet.Greeting;

public class GoodbyeGreeting implements Greeting {

    private final long id;
    private final String content;

    private static final String template = "Goodbye, %s!";

    public GoodbyeGreeting(Long id, String content) {
        this.id = id;
        this.content = String.format(template, content);
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
