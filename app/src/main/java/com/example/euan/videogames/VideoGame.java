package com.example.euan.videogames;

public class VideoGame {

    private int ranking;
    private String title;
    private String company;

    public VideoGame(int ranking, String title, String company){

        this.ranking = ranking;
        this.title = title;
        this.company = company;
    }

    public int getRanking(){
        return this.ranking;
    }

    public String getCompany() {
        return this.company;
    }

    public String getTitle() {
        return this.title;
    }
}
