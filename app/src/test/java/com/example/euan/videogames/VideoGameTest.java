package com.example.euan.videogames;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VideoGameTest {

    VideoGame videoGame;

    @Before
    public void before(){
        videoGame = new VideoGame(1, "BloodBourne", "From Software");
    }

    @Test
    public void hasRankingTest(){
        assertEquals(1, videoGame.getRanking());
    }

    @Test
    public void hasCompanyTest(){
        assertEquals("From Software", videoGame.getCompany());
    }

    @Test
    public void hasTitleTest(){
        assertEquals("BloodBourne",videoGame.getTitle());
    }


}
