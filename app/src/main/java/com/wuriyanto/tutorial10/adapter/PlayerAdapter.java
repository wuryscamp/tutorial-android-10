package com.wuriyanto.tutorial10.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.wuriyanto.tutorial10.R;
import com.wuriyanto.tutorial10.model.Player;

import java.util.List;

/**
 * Created by wurianto on 3/10/18.
 */

public class PlayerAdapter extends ArrayAdapter<Player> {

    private Activity context;
    private List<Player> players;

    public PlayerAdapter(@NonNull Activity context, @NonNull List<Player> players) {
        super(context, 0, players);

        this.players = players;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.player_list_detail, null, true);

        Player player = players.get(position);

        TextView tvPlayerName = (TextView) rowView.findViewById(R.id.tv_player_name);
        TextView tvPlayerPosition = (TextView) rowView.findViewById(R.id.tv_player_position);
        TextView tvPlayerNationality = (TextView) rowView.findViewById(R.id.tv_player_nationality);

        tvPlayerName.setText(player.getName());
        tvPlayerPosition.setText("Position : "+player.getPosition());
        tvPlayerNationality.setText("Nationality : "+player.getNationality());

        return rowView;
    }
}
