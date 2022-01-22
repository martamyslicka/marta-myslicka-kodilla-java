package com.kodilla.good.patterns.strategy.social.publisher;

import com.kodilla.good.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat";
    }
}
