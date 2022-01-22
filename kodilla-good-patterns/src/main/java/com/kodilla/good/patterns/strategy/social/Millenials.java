package com.kodilla.good.patterns.strategy.social;

import com.kodilla.good.patterns.strategy.social.publisher.FacebookPublisher;

public class Millenials extends User {

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
