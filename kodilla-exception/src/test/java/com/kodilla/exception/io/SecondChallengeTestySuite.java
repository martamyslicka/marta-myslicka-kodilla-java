package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestySuite {
    @Test
    void testProbablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
    }

    @Test
    void testProbablyIWillThrowException2() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.49));
    }

    @Test
    void testProbablyIWillThrowException3() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));

    }

    @Test
    void testProbablyIWillThrowException4() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.5));

    }

    @Test
    void testProbablyIWillThrowException5() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.49));
    }

    public static class FileReaderTestSuite {
        @Test
        void testReadFile1() {
            // given
            FileReader fileReader = new FileReader();
            // when & then
            assertDoesNotThrow(() -> fileReader.readFile());
        }


    }
}