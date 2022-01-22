package com.kodilla.good.patterns.social;

import com.kodilla.good.patterns.strategy.social.Millenials;
import com.kodilla.good.patterns.strategy.social.User;
import com.kodilla.good.patterns.strategy.social.YGeneration;
import com.kodilla.good.patterns.strategy.social.ZGeneration;
import com.kodilla.good.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User martha = new Millenials("Marta What");
        User olaf = new YGeneration("Olaf Who");
        User simon = new ZGeneration("Simon Boo");
        //when
        String marthaShouldPublish = martha.sharePost();
        System.out.println("Martha should publish on: " + marthaShouldPublish);
        String olafShouldPublish = olaf.sharePost();
        System.out.println("Olaf should publish on: " + olafShouldPublish);
        String simonShouldPublish = simon.sharePost();
        System.out.println("Simon should publish on: " + simonShouldPublish);
        //then
        assertEquals("Facebook", marthaShouldPublish);
        assertEquals("Twitter", olafShouldPublish);
        assertEquals("Snapchat", simonShouldPublish);
    }

    @Test
    void testIndividualSharingStrategy(){
        //given
        User olaf = new YGeneration("Olaf Who");
        //when
        String olafShouldPublish = olaf.sharePost();
        System.out.println("Olaf should publish on: " + olafShouldPublish);
        olaf.setSocialPublisher(new FacebookPublisher());
        olafShouldPublish = olaf.sharePost();
        System.out.println("Now Olaf should publish on: " + olafShouldPublish);
        //then
        assertEquals("Facebook", olafShouldPublish);

    }
}
