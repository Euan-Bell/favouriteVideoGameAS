package com.example.euan.videogames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FavouriteGamesAdaptor extends ArrayAdapter {

    public FavouriteGamesAdaptor(Context context, ArrayList<VideoGame> videoGames) {
        super(context, 0, videoGames);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.game_item, parent, false);
        }
        VideoGame currentVideoGame = (VideoGame) getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentVideoGame.getRanking().toString());

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentVideoGame.getTitle());

        TextView company = listItemView.findViewById(R.id.company);
        company.setText(currentVideoGame.getCompany());

        listItemView.setTag(currentVideoGame);

        listItemView.setTag(currentVideoGame);

        return listItemView;
    }
}


