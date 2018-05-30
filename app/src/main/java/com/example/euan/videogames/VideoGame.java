package com.example.euan.videogames;

public class VideoGame {

    private Integer ranking;
    private String title;
    private String company;

    public VideoGame(Integer ranking, String title, String company){

        this.ranking = ranking;
        this.title = title;
        this.company = company;
    }

    public Integer getRanking(){
        return this.ranking;
    }

    public String getCompany() {
        return this.company;
    }

    public String getTitle() {
        return this.title;
    }
}
