package com.kodilla.good.patterns.strategy.social;

import com.kodilla.good.patterns.strategy.social.publisher.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
