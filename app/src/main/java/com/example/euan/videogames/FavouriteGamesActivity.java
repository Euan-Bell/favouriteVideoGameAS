package com.example.euan.videogames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FavouriteGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_games);
    }


    FavouriteGames favouriteGames = new FavouriteGames();
    ArrayList<VideoGame> list = favouriteGames.getList();

    FavouriteGamesAdaptor gamesAdaptor = new FavouriteGamesAdaptor(this, list);

    ListView listView = (ListView) findViewById(R.id.list);
    listView.setAdaptor(favouriteGamesAdaptor);

    public void onListItemClick(View listItem) {
        VideoGame videoGame = (VideoGame) listItem.getTag();
        Log.d("Video Game Title: ", videoGame.getTitle());
    }

}
