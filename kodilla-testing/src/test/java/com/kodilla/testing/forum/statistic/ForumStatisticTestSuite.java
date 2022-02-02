package com.kodilla.testing.forum.statistic;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Forum Statistic Test Suite")
public class ForumStatisticTestSuite {

    @Mock
    private Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is a beginning of test.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All test are finished.");
    }

    private static int testCounter = 0;
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    private List<String> generateListOfUsers(int numberOfUsers) {
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0 ; i < numberOfUsers ; i++) {
            listOfUsers.add("User"+i);
        }
        return listOfUsers;
    }

    private int generatePostCount (int givenPosts){
        int postCount = givenPosts;
        return postCount;
    }

    private int generateCommentCount (int givenComments){
        int commentCount = givenComments;
        return givenComments;
    }

    @Test
    @DisplayName("0 Posts Test")
    void test0post(){
        //given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List <String> listOfUsers = generateListOfUsers(10);
        int postNo = generatePostCount(0);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postCount()).thenReturn(postNo);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(0, forumStatistic.getAvgPostsPerUser());
        assertEquals(0, forumStatistic.getAvgCommentsPerUser());
        assertEquals(0, forumStatistic.getAvgCommentsPerPost());

    }

    @Test
    @DisplayName("1000 Posts Test")
    void test1000post(){
        //given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List <String> listOfUsers = generateListOfUsers(1000);
        int postNo = generatePostCount(1000);
        int comNo = generateCommentCount(1000);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postCount()).thenReturn(postNo);
        when(statisticsMock.commentsCount()).thenReturn(comNo);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(1, forumStatistic.getAvgPostsPerUser());
        assertEquals(1, forumStatistic.getAvgCommentsPerUser());
        assertEquals(1, forumStatistic.getAvgCommentsPerPost());

    }

    @Test
    @DisplayName("0 comments Test")
    void test0comment(){
        //given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List <String> listOfUsers = generateListOfUsers(10);
        int postNo = generatePostCount(1000);
        int comNo = generateCommentCount(0);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postCount()).thenReturn(postNo);
        when(statisticsMock.commentsCount()).thenReturn(comNo);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(100, forumStatistic.getAvgPostsPerUser());
        assertEquals(0, forumStatistic.getAvgCommentsPerUser());
        assertEquals(0, forumStatistic.getAvgCommentsPerPost());

    }

    @Test
    @DisplayName("Comment No. < Posts No. Test")
    void testLessCommentsThanPosts(){
        //given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List <String> listOfUsers = generateListOfUsers(10);
        int postNo = generatePostCount(100);
        int comNo = generateCommentCount(10);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postCount()).thenReturn(postNo);
        when(statisticsMock.commentsCount()).thenReturn(comNo);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(10, forumStatistic.getAvgPostsPerUser());
        assertEquals(1, forumStatistic.getAvgCommentsPerUser());
        assertEquals(0.1, forumStatistic.getAvgCommentsPerPost());

    }

    @Test
    @DisplayName("Comment No. > Posts No. Test")
    void testMoreCommentsThanPosts(){
        //given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List <String> listOfUsers = generateListOfUsers(10);
        int postNo = generatePostCount(100);
        int comNo = generateCommentCount(1000);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postCount()).thenReturn(postNo);
        when(statisticsMock.commentsCount()).thenReturn(comNo);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(10, forumStatistic.getAvgPostsPerUser());
        assertEquals(100, forumStatistic.getAvgCommentsPerUser());
        assertEquals(10, forumStatistic.getAvgCommentsPerPost());

    }

    @Test
    @DisplayName("0 forum users Test")
    void test0forumUsers() {
        //given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List <String> listOfUsers = generateListOfUsers(0);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(0, forumStatistic.getAvgPostsPerUser());
        assertEquals(0, forumStatistic.getAvgCommentsPerUser());
        assertEquals(0, forumStatistic.getAvgCommentsPerPost());
    }

    @Test
    @DisplayName("100 forum users Test")
    void test100forumUsers(){
        //given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List <String> listOfUsers = generateListOfUsers(100);
        int postNo = generatePostCount(100);
        int comNo = generateCommentCount(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postCount()).thenReturn(postNo);
        when(statisticsMock.commentsCount()).thenReturn(comNo);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(1, forumStatistic.getAvgPostsPerUser());
        assertEquals(1, forumStatistic.getAvgCommentsPerUser());
        assertEquals(1, forumStatistic.getAvgCommentsPerPost());

    }

}
