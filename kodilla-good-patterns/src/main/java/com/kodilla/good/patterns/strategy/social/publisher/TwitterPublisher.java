package com.kodilla.good.patterns.strategy.social.publisher;

import com.kodilla.good.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }

}
