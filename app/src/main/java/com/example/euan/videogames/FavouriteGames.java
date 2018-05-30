package com.example.euan.videogames;

import java.util.ArrayList;

public class FavouriteGames {

    private ArrayList<VideoGame> list;

    public FavouriteGames(){
        list = new ArrayList<VideoGame>();
        list.add(new VideoGame(1, "BloodBourne", "From Software"));
        list.add(new VideoGame(2, "Alan Wake", "Remedy"));
        list.add(new VideoGame(3, "Red Dead Redemption", "Rockstar"));
        list.add(new VideoGame(4, "God of War", "Santa Monica Studios"));
        list.add(new VideoGame(5, "FireWatch", "Campo Santo"));
    }

    public ArrayList<VideoGame> getList(){
        return new ArrayList<VideoGame>(list);
    }
}
