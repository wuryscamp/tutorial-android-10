package com.wuriyanto.tutorial10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.wuriyanto.tutorial10.adapter.PlayerAdapter;
import com.wuriyanto.tutorial10.model.Player;
import com.wuriyanto.tutorial10.service.PlayerService;
import com.wuriyanto.tutorial10.service.PlayerServiceImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewPlayer;
    private PlayerAdapter playerAdapter;
    private PlayerService playerService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPlayer = (ListView) findViewById(R.id.lv_players);

        //load data
        loadPlayerDatas();

        listViewPlayer.setAdapter(playerAdapter);


    }

    private void loadPlayerDatas(){
        playerService = new PlayerServiceImpl();
        List<Player> players = playerService.getPlayers();

        playerAdapter = new PlayerAdapter(this, players);
    }
}
